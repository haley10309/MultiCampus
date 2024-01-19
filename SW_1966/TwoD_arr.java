import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoD_arr {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("Class_Excercise/res/input _twoD.txt"));
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int T = 10;

        for (int test_case = 1; test_case <= T; test_case++) {
            int[][] arr = new int[100][100];
            int test_num = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            int biggest_num = 0;
            int[] horiz_sum = new int[100];
            int[] vertic_sum = new int[100];
            int right_diagonal = 0;
            int left_diagonal = 0;

            sb.append("#" + test_num).append(" ");

            for (int i = 0; i < 100; i++) { // 배열 입력 받기
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = sc.nextInt();
                    horiz_sum[j] = horiz_sum[j] + arr[i][j];
                    vertic_sum[i] = vertic_sum[i] + arr[i][j];
                    if (i == j) {
                        right_diagonal = right_diagonal + arr[i][j];
                    } 
                    if ((i+j) == 99 ) {
                        left_diagonal = left_diagonal + arr[i][j];
                    }

                }
            }
            for (int i = 0; i < 100; i++) {
                if (horiz_sum[i] > biggest_num) {
                    biggest_num = horiz_sum[i];
                    //sb.append(biggest_num).append(" ");
                }
                if (vertic_sum[i] > biggest_num) {
                    biggest_num = vertic_sum[i];
                    //sb.append(biggest_num).append(" ");
                }
            }
            if (right_diagonal > biggest_num) {
                biggest_num = right_diagonal;
                //sb.append(biggest_num).append(" ");
            } 
            if (left_diagonal > biggest_num) {
                biggest_num = left_diagonal;
                //sb.append(biggest_num).append(" ");
            }
            sb.append(biggest_num).append("\n");

        }
        System.out.println(sb);
    }
}
