package ex15;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {
    public static void main(String[] args) {
        InputStream input = System.in; // 키보드
        try {
            int value = input.read(); // 아스키코드
            System.out.println("받은 값 : " + (char)value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
