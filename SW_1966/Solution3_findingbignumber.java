import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution3_findingbignumber {
    public static void main(String[] arg) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        /*
         * 여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
         */
        int[] big_arr = new int[T];
        for (int test_case = 1; test_case <= T; test_case++) {
            int[] arr = new int[10];
            for(int i =0 ;i<arr.length ;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            big_arr[test_case-1] = arr[9];

        }
        for (int k = 0; k < T; k++) {
            System.out.println("#" + (k + 1) + " " + big_arr[k]);
        }
    }
}
