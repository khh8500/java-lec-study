package ex16;

class MyRunnable2 implements Runnable {
    String myName;
    public MyRunnable2(String name) {
        myName = name;
    }
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(myName + i + " ");
        }
    }
}

public class TestThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable2("A"));
        Thread t2 = new Thread(new MyRunnable2("B"));
        t1.start();
        t2.start();
    }
}
