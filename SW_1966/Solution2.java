import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        int[] avg_arr = new int[T];
        for (int test_case = 1; test_case <= T; test_case++) {
            int[] arr = new int[10];
            for (int i = 0; i < 10; i++) {// 배열 입력 받기
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int small = arr[0];
            int big = arr[9];
            int sum = 0;
            int count =0;
            for (int i = 1; i < 9; i++) { // 최솟값과 최댓값을 제외한 평균
                if((arr[i] != small)&&(arr[i] != big)){
                    sum = sum + arr[i];
                    count++;
                }
                
            }
            avg_arr[test_case - 1] = Math.round(sum / count);
        }
        for (int k = 0; k < T; k++) {
            System.out.println("#" + (k + 1) + " " + avg_arr[k]);
        }
    }
}

