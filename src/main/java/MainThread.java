public class MainThread {
    public static void main(String[] args) {


        Thread myThread = new Thread(new CountThread(),"CountThread");
        myThread.start();
        CountThread.checkActivity(myThread);
        try {
            Thread.sleep(150);
            myThread.interrupt();
            Thread.sleep(150);
            myThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.print("\n");
        Shop shop = new Shop();
        Client client = new Client(shop);
        Factory factory = new Factory(shop);
        new Thread(factory).start();
        new Thread(client).start();


    }
}
