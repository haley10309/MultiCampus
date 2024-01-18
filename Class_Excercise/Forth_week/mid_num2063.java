package Forth_week;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class mid_num2063 {
    public static void main(String[] args) throws IOException {
        
        System.setIn(new FileInputStream("Class_Excercise/res/input.txt"));

        /*
         * 표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
         */
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[T];
        for (int test_case = 0; test_case < T; test_case++) {

            arr[test_case] = sc.nextInt();

        }
        Arrays.sort(arr);
        int middle = arr[(T-1)/2];
        sb.append(middle+"");

        System.out.println(sb);
    }
}
