public class Shop {
    // This class forces threads factory and client to wait for notifications
    private int product = 0;

    public synchronized void get() {
        while (product < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        product--;
        System.out.println("One item was bought");
        System.out.println("Not enough products: " + product);
        notify();
    }
    public synchronized void put() {
        while (product>=2) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        product++;
        System.out.println("Item was added");
        System.out.println("Items available : " + product);
        notify();
    }
}
