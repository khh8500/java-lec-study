package ex16;

class Printer3 {
    void print(int[] arr) throws Exception {
        synchronized (this) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
                Thread.sleep(100);
            }
        }
    }
}

public class DeadLockTest {
    public static void main(String[] args) {
        final String res1 = "Gold";
        final String res2 = "Silver";

        Thread t1 = new Thread(() -> {
            synchronized (res1) {
                System.out.println("Thread 1: 자원 1 획득");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {}
                    synchronized (res2) {
                        System.out.println("Thread 1: 자원 2 획득");
                    }
                }
            }
        );

        Thread t2 = new Thread(() -> {
            synchronized (res2) {
                System.out.println("Thread 2: 자원 2 획득");
                try {
                    Thread.sleep(100);
                } catch (Exception e) {}
                    synchronized (res1) {
                        System.out.println("Thread 2: 자원 1 획득");
            }
        }
    }
);

        t1.start();
        t2.start();
    }
}