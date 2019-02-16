public class Factory implements Runnable{
    Shop shop;
    Factory(Shop shop){
        this.shop = shop;
    }
    public void run(){
        for (int i = 1; i < 4; i++) {
            this.shop.put();
        }
    }
}
