package HelloWorld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average_Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        System.out.println("수학 점수: ");
        int math = Integer.parseInt(br.readLine());
        System.out.println("국어점수: ");
        int korean = Integer.parseInt(br.readLine());
        System.out.println("영어 점수 : ");
        int English = Integer.parseInt(br.readLine());
        System.out.println("프로그래밍 점수: ");
        int programming = Integer.parseInt(br.readLine());

        int average = (math + korean + English + programming) / 4;
        String grade;
        if(average>= 95){
            grade = "A+";
        }else if(average >= 90 ){
            grade = "A";
        }else if(average >= 85 ){
            grade = "B+";
        }else if(average >= 80 ){
            grade = "B";
        }else if(average >= 70 ){
            grade = "C";
        }else if(average >= 60 ){
            grade = "D";
        }else {
            grade = "F";
        }
        sb.append("4가지 과목의 평균은 ").append(average).append("입니다").append("\n");
        sb.append("학점은 ").append(grade).append("입니다.").append("\n");
        System.out.println(sb);
    }
}
