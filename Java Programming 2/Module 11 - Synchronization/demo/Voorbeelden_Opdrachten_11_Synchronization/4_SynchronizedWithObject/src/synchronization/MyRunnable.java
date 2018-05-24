package synchronization;

public class MyRunnable implements Runnable {
    private static final Object LOCK = new Object();
    private MyClass myClass;

    public MyRunnable(MyClass myClass) {
        this.myClass = myClass;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (LOCK) {
                myClass.setNumber(myClass.getNumber() + 1);
            }
        }
    }
}
