package HelloWorld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CelToFah {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        System.out.println("화씨를 입력하시오 : ");
        double fah = Integer.parseInt(br.readLine());
        double cel = (fah - 32) * 5 / 9;
        sb.append("섭씨 ").append(cel).append("입니다.");
        System.out.println(sb);
    }
}
