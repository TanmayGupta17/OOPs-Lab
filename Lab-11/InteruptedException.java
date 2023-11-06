
class MyThread implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println("Thread: " + Thread.currentThread().getName() + "was interrupted");
            return;
        }
    }
}

public class InteruptedException {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted");
        }
    }
}
