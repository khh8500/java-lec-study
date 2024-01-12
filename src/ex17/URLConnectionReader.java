package ex17;

import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLConnection;

public class URLConnectionReader {
    public static void main(String[] args) throws Exception {
        URL site = new URL("https://www.naver.com/");
        URLConnection url = site.openConnection();
        BufferedReader in = new BufferedReader(
          new InputStreamReader(url.getInputStream())
        );
        String inline;

        while ((inline = in.readLine()) != null)
            System.out.println(inline);
        in.close();
    }
}
