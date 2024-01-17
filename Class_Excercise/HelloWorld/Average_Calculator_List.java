package HelloWorld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Average_Calculator_List {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> subject_score = new ArrayList<>();
        ArrayList<String> subject_name = new ArrayList<>(Arrays.asList("수학","물리","영어","프로그래밍"));
        int sum = 0;
        int result = 0;
        for(int i =0 ;i<subject_name.size();i++){
            System.out.println(subject_name.get(i)+"의 점수를 입력해주세요 : ");
            subject_score.add(Integer.parseInt(br.readLine()));
            sum = sum + subject_score.get(i);
        }
        result = sum/subject_name.size();
        sb.append(subject_name.size()+"가지 과목의 평균은 "+result+"입니다.");
        System.out.println(sb);
    }
}
