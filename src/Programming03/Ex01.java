package Programming03;

import java.util.Scanner;

public class Ex01 {
    //사용자가 입력한 값이 1~9이면 ONE~NINE까지 출력하는 프로그램
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int user = sc.nextInt();
        if (user == 1)
            System.out.println("ONE");
        else if (user == 2)
            System.out.println("TWO");
        else if (user == 3)
            System.out.println("THREE");
        else if (user == 4)
            System.out.println("FOUR");
        else if (user == 5)
            System.out.println("FIVE");
        else if (user == 6)
            System.out.println("SIX");
        else if (user == 7)
            System.out.println("SEVEN");
        else if (user == 8)
            System.out.println("AIGHT");
        else if (user == 9)
            System.out.println("NINE");
        else
            System.out.println("OTHER");

    }
    //1~9사이 값이 아니면 OTHER 출력
}
