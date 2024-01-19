import java.io.FileInputStream;
import java.util.Scanner;

public class snail_1954 {
    public static void main(String args[]) throws Exception {

        System.setIn(new FileInputStream("Class_Excercise/res/input1954.txt"));

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T;
        T = sc.nextInt();

        /*
         * 여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
         */

        for (int test_case = 1; test_case <= T; test_case++) {

            int test_order = sc.nextInt();
            int side_length = test_order;
            int k = 1;
            int[][] arr = new int[test_order][test_order];
            int bottom = 0;
            int right = -1;
            int top = 1;

            sb.append("#" + test_case).append("\n");

            for (int i = 0; i < test_order; i++) {
                for (int j = 0; j < side_length; j++) {
                    right = right + top;
                    arr[bottom][right] = k;
                    k++;
                }
                side_length--;
                for (int j = 0; j < side_length; j++) {
                    bottom = bottom + top;
                    arr[bottom][right] = k;
                    k++;
                }
                top = top * (-1);

            }
            for (int i = 0; i < test_order; i++) {
                for (int j = 0; j < test_order; j++) {
                    sb.append(arr[i][j]).append(" ");
                }
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}