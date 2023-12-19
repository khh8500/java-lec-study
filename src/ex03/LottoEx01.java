package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx01 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Random r = new Random();

        int num;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                num = r.nextInt(3) + 1;
                arr[i] = num;
            } else {
                while (true) {
                    num = r.nextInt(3) + 1;
                    if (arr[i - 1] != num) {
                        arr[i] = num; // 0번지랑 비교해야 함
                        if (arr[0] == arr[i]) {
                            num = r.nextInt(3) + 1;
                            if (arr[i - 1] != num) {
                                arr[i] = num;
                            }



                            break;
                        }
                    }
                }
            }

            System.out.println(Arrays.toString(arr));
        }
    }
}