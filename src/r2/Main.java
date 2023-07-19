package r2;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main start");
        Runnable runnable = () -> {
            System.out.printf("%s + priority %d start\n", Thread.currentThread().getName(), Thread.currentThread().getPriority());
            try{
                Thread.sleep(500);
            }catch (InterruptedException exception){
                System.out.println("Thread error");
            }
            System.out.printf("%s finish\n", Thread.currentThread().getName());
        };
        Thread thread = new Thread(runnable, "MyTh");
        thread.start();
        System.out.println("Main thread finish");
    }

}
