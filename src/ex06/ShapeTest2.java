package ex06;

class Shape3 {
    protected int x, y;
    public void draw() {
        System.out.println("Shape Draw");
    }
}

class Rectangle1 extends Shape3 {
    private int width, height;
    public void draw() {
        System.out.println("Rectangle Draw");
    }
}

class Triangle1 extends Shape3 {
    private int base, height;
    public void draw() {
        System.out.println("Triangle Draw");
    }
}

class Circle1 extends Shape3 {
    private int radius;
    public void draw() {
        System.out.println("Circle Draw");
    }
}

public class ShapeTest2 {
    public static void main(String[] args) {
        Shape3 s = new Rectangle1();
        Rectangle1 r = new Rectangle1();
        s.x = 0;
        s.y = 0;
    }
}
