package r5;

public class CountThread implements Runnable{

    CommonRes res;

    public CountThread(CommonRes res) {
        this.res = res;
    }

    @Override
    public void run() {
        res.increment();
    }
}
