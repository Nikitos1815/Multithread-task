public class Client implements Runnable {
    Shop shop;
    Client(Shop shop){
        this.shop = shop;
    }
    public void run(){
        for (int i = 1; i < 4; i++) {
            this.shop.get();
        }
    }
}
