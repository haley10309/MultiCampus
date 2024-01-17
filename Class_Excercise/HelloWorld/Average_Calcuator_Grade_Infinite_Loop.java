package HelloWorld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Average_Calcuator_Grade_Infinite_Loop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean keep_going = true;
        ArrayList<String> subject_name = new ArrayList<>();
        String reply = "keep";
        int sum = 0;
        while (keep_going) {
            System.out.println("과목의 이름을 알려주세요: ");
            subject_name.add(br.readLine());
            System.out.println("해당 과목의 점수를 알려주세요: ");

            sum = sum + Integer.parseInt(br.readLine());
            while (true) {
                System.out.println("계속하시겠습니까? (keep/quit)");
                reply = br.readLine();

                if (reply.equals("quit")) {
                    keep_going = false;
                    break;
                } else if (reply.equals("keep")) {
                    keep_going = true;
                    break;
                }
            }

        }
        int average = sum / (subject_name.size());
        sb.append(subject_name.size()).append("가지 과목의 평균은 ").append(average).append("입니다.");
        System.out.println(sb);
        br.close();
    }
}
