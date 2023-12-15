package ex03.test;

public class BubbleTest04 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};

        final int N = arr.length;

        int temp;

        if (arr[0] > arr[1]) {
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }

        // {5, 2, 8, 4, 3}
        if (arr[1] >arr[2]) {
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }

        //{5, 2, 4, 8, 3}
        if (arr[2] >arr[3]) {
            temp = arr[2];
            arr[2] = arr[3];
            arr[3] = temp;
        }

        //{5, 2, 4, 3, 8}
        if (arr[3] >arr[4]) {
            temp = arr[3];
            arr[3] = arr[4];
            arr[4] = temp;
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}