package HelloWorld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average_Calculator_Array {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] subject_score = new int[4];
        String[] subject_name = {"수학","물리","영어","프로그래밍"};
        int sum = 0;
        int average = 0;
        for(int i = 0;i<subject_name.length;i++){
            System.out.println(subject_name[i]+"의 점수를 입력해주세요: ");
            subject_score[i] = Integer.parseInt(br.readLine());
            sum = sum + subject_score[i];
        }
        average = sum/(subject_name.length);
        sb.append(subject_name.length+"가지 과목의 평균은 "+ average + "입니다.");
        System.out.println(sb);
        
    }
}
