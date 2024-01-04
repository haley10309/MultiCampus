package Class_Excercise.Second_week.Date_Possibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyDateTest {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        MyDate day1 = new MyDate(0, 0, 0);
        
        System.out.println("년도 : ");
        day1.setYear(Integer.parseInt(br.readLine()));
        System.out.println("월:");
        day1.setMonth(Integer.parseInt(br.readLine()));
        System.out.println("일: ");

        day1.setDay(Integer.parseInt(br.readLine()));

        boolean result = day1.isValid(day1);
        if(result == true){
            sb.append("가능한 날짜 입니다.").append("\n");
        
        }else{
            sb.append("불가능한 날짜 입니다.").append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
