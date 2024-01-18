package Forth_week;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class two_num1959 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("Class_Excercise/res/input_1959.txt"));

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T;
        T = sc.nextInt();
        /*
         * 여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
         */

        for (int test_case = 1; test_case <= T; test_case++) {
            int[] first_arr = new int[sc.nextInt()];
            int[] second_arr = new int[sc.nextInt()];
            int [] longer_arr ;
            int [] shorter_arr ;
            for (int i = 0; i < first_arr.length; i++) {
                first_arr[i] = sc.nextInt();
            }
            for (int i = 0; i < second_arr.length; i++) {
                second_arr[i] = sc.nextInt();
            }
            if(first_arr.length>second_arr.length){
                longer_arr = first_arr;
                shorter_arr = second_arr;
            } else{
                longer_arr = second_arr;
                shorter_arr = first_arr;
            }
            int big = 0;
            double second_limit = Math.abs(longer_arr.length - shorter_arr.length + 1);
            for (int i = 0; i < second_limit ; i++) {
                int sum = 0;
                for (int j = 0; j < shorter_arr.length; j++) {
                    sum = sum + (shorter_arr[j] * longer_arr[i + j]);
                }
                if (sum > big) {
                    big = sum;
                }
            }
            sb.append("#"+test_case+" ").append(big).append("\n");

        }
        System.out.println(sb);
    }
}
