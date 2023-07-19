package r4;

public class AThread extends Thread{

    public AThread(String name) {
        super(name);
    }

    public void run(){
        System.out.printf("%s start\n", Thread.currentThread().getName());
        int counter=1;
        try{
            while (!isInterrupted()){
            System.out.println(counter++);

                Thread.sleep(100);
            }}
            catch (InterruptedException exception){
                System.out.println(getName());

            }

        System.out.printf("%s finished", Thread.currentThread().getName());
    }
}
