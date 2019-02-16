public class CountThread implements Runnable {

    public static void checkActivity(Thread countThread){
        if(countThread.isAlive()){
            System.out.println("Current thread(" + countThread.getName() + ") is active");
        }else{
            System.out.println("Current thread(" + countThread.getName() + ") isn't active");
        }
    }
    public static void finishThread(Thread countThread){
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println(Thread.currentThread().getName() + " is working well");
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
    }
    public static void sleepThread(Thread countThread){
        try{
            System.out.println(Thread.currentThread().getName() + " is sleeping");
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
    }
    public void run() {
        System.out.printf("%s started... \n", Thread.currentThread().getName());

            finishThread(Thread.currentThread());
            sleepThread(Thread.currentThread());

        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}
