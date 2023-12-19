package ex04;

public class MethodEx01 {

    static void m1(){
        System.out.println("m1");
    }

    static String m2(){
        System.out.println("m2");
        return "m2"; // 메서드 종료
    }

    public static void main(String[] args) {
        m1(); // 같은 클래스여서 클래스명 생략가능, 실행 시에 내부(6)
        String result = m2(); // 실행 시에 m2 내부(10, 11)가 보임, 원래는 안보임, 실행이 끝나면 리턴 값이 바뀐다. "m2"
        System.out.println("restult : " + result);
    }
}
