package r6;

public class Store {

    private int product = 0;

    public synchronized void put(){
        while (product>=3){
            try {
                wait();
            }catch (InterruptedException exception){}
        }
        product++;
        System.out.println("+1 товар");
        System.out.println("Товаров="+product);
        notify();
    }
    public synchronized void get(){
        while (product<1){
            try {
                wait();
            }catch (InterruptedException exception){}
        }
        product--;
        System.out.println("-1 товар");
        System.out.println("Товаров="+product);
        notify();
    }


}
