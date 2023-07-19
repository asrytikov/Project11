package r4;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main start");
        AThread thread = new AThread("Athread");
        thread.start();

        try{
            Thread.sleep(10);
            thread.interrupt();
            Thread.sleep(10);
        }catch (InterruptedException exception){
            System.out.println("Thread ERR");
        }

        System.out.println("Main finish");
    }

}
