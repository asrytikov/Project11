package r3;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main start");
        MyThread thread = new MyThread();
        new Thread(thread, "Myth").start();

        try{
            Thread.sleep(1200);
            thread.disable();
            Thread.sleep(1200);
        }catch (InterruptedException exception){
            System.out.println("Thread ERR");
        }

        System.out.println("Main finish");
    }

}
