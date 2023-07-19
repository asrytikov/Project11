public class Main {
    public static void main(String[] args) {

       /*Thread thread = Thread.currentThread();
        System.out.println(thread.getThreadGroup().getName());*/

        System.out.println("Main thread start");
        for (int i = 0; i < 3; i++) {
            MyThread t1 = new MyThread("MyTh"+i);
            t1.start();
            try {
                t1.join();
            }catch (InterruptedException exception){
                System.out.println("My th is err");
            }

        }
        System.out.println("Main thread finish");

    }
}

class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    public void run(){
        System.out.printf("%s + priority %d start\n", Thread.currentThread().getName(), Thread.currentThread().getPriority());
        try{
            Thread.sleep(500);
        }catch (InterruptedException exception){
            System.out.println("Thread error");
        }
        System.out.printf("%s finish\n", Thread.currentThread().getName());
    }
}