package ex15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx02 {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);
        char[] ch = new char[4]; // 보조 스트림, 버퍼아님, 캐스팅 알아서 해줌

        try {
            ir.read(ch); // 보조 스트림으로부터 읽음

            for (char c : ch) {
                System.out.println(c + " ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
