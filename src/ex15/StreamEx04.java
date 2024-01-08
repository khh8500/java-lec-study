package ex15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StreamEx04 {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 모니터
        try {
            bw.write("안녕\n"); // 내려쓰기
            bw.write("반가워\n"); // 엔터기능 readLine이 \n을 읽기 때문에 \n을 적어줘야 읽는다.
            bw.flush(); // 플러쉬를 해야 나옴
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
