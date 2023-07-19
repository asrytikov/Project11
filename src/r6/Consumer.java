package r6;

public class Consumer implements Runnable{

    Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 1; i < 20; i++) {
            store.get();
        }
    }
}
