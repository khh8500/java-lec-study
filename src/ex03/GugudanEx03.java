package ex03;

public class GugudanEx03 {
    public static void main(String[] args) {
        // \t는 탭, \ndms 엔터
        for (int i = 1; i <= 9; i++) {
            for (int x = 2; x <= 9; x++) {
                System.out.print(x + "*" + i + "=" + x * i + "\t");
            }
            System.out.println();

            //System.out.println("2*2=4\t");
            //System.out.println("2*2=4\t");
            //System.out.println("2*2=4\t");
        }
    }
}