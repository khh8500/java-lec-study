package ex03;

import java.util.Random;
import java.util.Scanner;

public class TheGuessingGame {
    public static void main(String[] args) {

        /**
         * 사용자로부터 숫자를 guess로 입력받는다.
         * 시도횟수를 증가한다.
         * if(guess < answer)
         * 제시한 숫자가 낮다고 출력한다.
         * * if(guess > answer)
         * 제시한 숫자가 높다고 출력한다.
         * while(guess != answer);
         * "축하합니다"와 시도횟수를 출력한다.
         */

        //ArrayList<String> guess = new ArrayList<>();
        Random random = new Random();
        int answer = random.nextInt(100)+1; // 컴퓨터가 랜덤 숫자 1~100까지
        Scanner sc = new Scanner(System.in);
        int count = 0;

        // 맞추기까지 반복되어야 한다. while을 쓸 건데 조건문이 트루면 계속 돌아감
        //break는 일치할 때
        while (true) {
            System.out.print("정답을 추측하여 보시오: ");
            int guess = sc.nextInt();

            if (guess < answer) {
                count++;
                System.out.println("제시한 정수가 낮습니다.");
            }

            if (guess > answer) {
                count++;
                System.out.println("제시한 정수가 높습니다.");
            }

            if (guess == answer) {
                count++;
                System.out.print("축하합니다." + "시도횟수=" + count);

                break;
            }
        }
    }
}