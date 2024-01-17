package HelloWorld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average_Calculator_Grade_For {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        System.out.println("총 몇 과목입니까?");
        int subject_num = Integer.parseInt(br.readLine());
        int sum = 0;
        int average = 0;
        for (int i = 0; i < subject_num; i++) {
            System.out.println((i + 1) + "번째 과목은 몇 점입니까?" + "(" + (i + 1) + "/" + subject_num+")");
            sum = sum + Integer.parseInt(br.readLine());
        }
        average = sum / subject_num;
        sb.append(subject_num).append("가지 과목의 평균은 ").append(average).append("입니다.");
        System.out.println(sb);
        br.close();

    }
}
