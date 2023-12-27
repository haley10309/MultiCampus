package HelloWorld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        System.out.println("첫번 째 수: ");
        int num1 = Integer.parseInt(br.readLine());
        System.out.println("두번 째 수: ");
        int num2 = Integer.parseInt(br.readLine());
        System.out.println("연산자: ");
        String line = br.readLine();
        char operator = line.charAt(0);
        double result = 0 ;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;

            default:System.out.println("사칙연산을 진행할 수 없습니다.");
                break;
        }
        sb.append(result).append("\n");
        System.out.println(sb);
        br.close();
    }
}
