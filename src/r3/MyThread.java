package r3;

public class MyThread implements Runnable{

    private boolean isAct;

    void disable(){
        isAct = false;
    }

    MyThread(){
        isAct = true;
    }

    @Override
    public void run() {
        System.out.printf("%s start\n", Thread.currentThread().getName());
        int counter = 1;
        while (isAct){
            System.out.println(counter++);
            try{
                Thread.sleep(500);
            }catch (InterruptedException exception){
                System.out.println("ERR");
            }
        }

        System.out.printf("%s finish\n", Thread.currentThread().getName());
    }
}
