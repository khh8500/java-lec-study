package ex03;

import java.util.Scanner;

public class GugudanEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("구구단 몇 단을 알고 싶은지 입력하시오: ");
            int n = sc.nextInt();

            if (2 <= n && n <= 9) {
                for (int i = 1; i <= 9; i++) {
                    System.out.println(n + "*" + i + "=" + (n * i));
                }
                break;
            } else {
                System.out.println("2에서 9사이의 값을 입력하시오: ");
            }
        }
    }
}