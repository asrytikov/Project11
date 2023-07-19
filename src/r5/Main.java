package r5;

public class Main {

    public static void main(String[] args) {
        CommonRes commonRes = new CommonRes();
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new CountThread(commonRes));
            thread.setName("Thread" + i);
            thread.start();
        }
    }

}
