package ex04;

public class DeskLamp {

    private boolean isON;

    public void turnOn() { isON = true; }
    public void turnOff() { isON = false; }
    public String toString() {
        return "현재 상태는 " + (isON == true ? "켜짐" : "꺼짐");
    }
}

