package ex06;

class Animal2 {
    void speak() {
        System.out.println("Animal 클래스의 sound()");
    }
}

class Dog2 extends Animal2 {
    void speak() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal2 {
    void speak() {
        System.out.println("야옹");
    }
}

public class DynamicCallTest {
    public static void main(String args[]) {
        Animal2 a1 = new Dog2();
        Animal2 a2 = new Cat();

        a1.speak();
        a2.speak();
    }
}
