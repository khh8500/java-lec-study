package ex06;

class Shape2{
    public void draw() {
        System.out.println("Shape 중의 하나를 그릴 예정입니다.");
    }
}

class Circle2 extends Shape2 {
    @Override
    public void draw() {
        super.draw();
        System.out.println("Circle을 그립니다.");
    }
}

public class ShapeTest1 {
    public static void main(String[] args) {
        Circle2 s = new Circle2();
        s.draw();
    }
}
