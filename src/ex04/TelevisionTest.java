package ex04;

class Television1 {
    int channel;
    int volume;
    boolean onOff;

    Television1(int c, int v, boolean o) {
        channel = c;
        volume = v;
        onOff = o;
    }

    void print() {
        System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
    }
}

public class TelevisionTest {
    public static void main(String[] args) {
        Television1 myTv = new Television1(7, 10, true);
        myTv.print();

        Television1 yourTv =new Television1(11, 20, true);
        yourTv.print();
    }
}
