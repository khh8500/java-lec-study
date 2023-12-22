package ex06;

class Parent {
    void print() {
        System.out.println("Parent 메서드 호출");
    }
}

class Child extends Parent {
    @Override
    void print() {
        System.out.println("Child 메서드 호출");
    }
}

public class Catsting {
    public static void main(String[] args) {
        Parent p = new Child(); // 여기서 p는 Parent 타입의 참조 변수이지만, Child 클래스의 객체를 참조
        p.print();

        Child c = (Child)p; // p는 실제로 Child 객체를 참조하고 있으므로, Child 타입으로 명시적으로 캐스팅이 가능
        c.print();
    }
}
