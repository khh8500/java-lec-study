package ex16;

class Printer2 {
    synchronized void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread3 extends Thread {
    Printer2 prn;
    int[] myarr = {10, 20, 30, 40, 50};

    MyThread3(Printer2 prn) {
        this.prn = prn;
    }
    public void run() {
        prn.print(myarr);
    }
}

class MyThread4 extends Thread {
    Printer2 prn;
    int[] myarr = {1, 2, 3, 4, 5};

    MyThread4(Printer2 prn) {
        this.prn = prn;
    }
    public void run() {
        prn.print(myarr);
    }
}

public class TestSynchro2 {
    public static void main(String[] args) {
        Printer2 obj = new Printer2();
        MyThread3 t1 = new MyThread3(obj);
        MyThread4 t2 = new MyThread4(obj);
        t1.start();
        t2.start();
    }
}
