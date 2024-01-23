import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class crop_2805 {
    static int[] dr = { 0, 1, 0, -1 };
    static int[] dc = { 1, 0, -1, 0 };

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("Class_Excercise/res/input_2805.txt"));

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T;
        T = sc.nextInt();
        String trash = sc.nextLine();
        for (int test_case = 1; test_case <= T; test_case++) {

            int N = Integer.parseInt(sc.nextLine());
            int income = 0;
            int[][] arr = new int[N][N];
            int[][] count = new int[N][N];
            // 배열 값 입력 받기
            for (int i = 0; i < N; i++) {
                String[] line = sc.nextLine().split("");
                for (int j = 0; j < N; j++) {

                    arr[i][j] = Integer.parseInt(line[j]);
                }
            }
            // 가운데 찾기
            int mid_r = (N - 1) / 2;
            int mid_c = (N - 1) / 2;
            count[mid_r][mid_c] = 1;

            for (int k = 0; k < ((N - 1) / 2); k++) {
                ArrayList<Integer> checked_r = new ArrayList<>();
                ArrayList<Integer> checked_c = new ArrayList<>();
                for (int i = 0; i < N ; i++) {
                    for (int j = 0; j < N; j++) {
                        if (count[i][j] == 1) {
                            checked_r.add(i);
                            checked_c.add(j);
                        }
                    }
                }
                for (int i = 0; i < checked_c.size(); i++) {
                    count[checked_r.get(i) + 1][checked_c.get(i)] = 1;
                    count[checked_r.get(i) - 1][checked_c.get(i)] = 1;
                    count[checked_r.get(i)][checked_c.get(i) + 1] = 1;
                    count[checked_r.get(i)][checked_c.get(i) - 1] = 1;
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (count[i][j] == 1) {
                        income = income + arr[i][j];

                    }
                }
            }
            sb.append("#").append(test_case).append(" ").append(income).append("\n");
        }
        System.out.println(sb);

    }
}
