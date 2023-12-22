package ex06;

public class ShapeTest3 {
    public static void main(String[] args) {
        Shape3[] arrayOfShapes;
        arrayOfShapes = new Shape3[3];

        arrayOfShapes[0] = new Rectangle1();
        arrayOfShapes[1] = new Triangle1();
        arrayOfShapes[2] = new Circle1();

        for (int i = 0; i < arrayOfShapes.length; i++) {
            arrayOfShapes[i].draw();
        }
    }
}
