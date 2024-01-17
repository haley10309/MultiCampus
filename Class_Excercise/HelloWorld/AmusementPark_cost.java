package HelloWorld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AmusementPark_cost {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        System.out.println("나이를 입력해주세요 : ");
        int age = Integer.parseInt(br.readLine());
        int cost ;

        if(age < 8){
            cost = 1000;
        }else if(age <14){
            cost = 2000;
        }else if(age <20){
            cost = 2500;
        }else if(age >= 60){
            cost = 0;
        }else{
            cost = 3000;
        }
        sb.append("입장료는 ").append(cost).append("원 입니다.");
        System.out.println(sb);
        br.close();
        }
}
