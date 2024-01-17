package HelloWorld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Average_Calculator_Map {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> subject = new HashMap<>();
        System.out.println("총 몇 과목인가요? ");
        int subject_num = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < subject_num; i++) {
            System.out.println("과목 이름을 입력해주세요: ");
            String subject_name = br.readLine();
            System.out.println(subject_name+"의 점수를 입력해주세요: ");
            int subject_score = Integer.parseInt(br.readLine());
            subject.put(subject_name, subject_score);
            sum = sum + subject_score;
        }
        int average = sum/subject.size();
        sb.append("과목          점수").append("\n");
        subject.forEach((key,value) -> {
            sb.append("----------------------").append("\n");
            sb.append(key+ "          "+ value).append("\n");
        });
        sb.append(subject_num+"가지 과목의 평균은 "+average+"입니다.");
        System.out.println(sb);
    }
}
