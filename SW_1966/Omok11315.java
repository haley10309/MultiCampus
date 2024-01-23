import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Omok11315 {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("Class_Excercise/res/sample_input11315.txt"));
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            String trash = sc.nextLine();
            String[][] arr = new String[N][N];
            sb.append("#").append(test_case).append(" ");
            for (int i = 0; i < N; i++) {
                String[] line = sc.nextLine().split("");
                for (int j = 0; j < N; j++) {
                    arr[i][j] = line[j];
                }
            }
            int win = 0;
            boolean omok = false;
            // 오목 성립 조건

            for (int r = 0; r < (N); r++) {
                for (int c = 0; c < (N); c++) {
                    if (arr[r][c].equals("o")) {
                        for (int k = 0; k <= (N - 5); k++) {

                            if ((arr[r][k].equals("o")) && (arr[r][k].equals(arr[r][k + 1]))
                                    && (arr[r][k].equals(arr[r][k + 2]))
                                    && (arr[r][k].equals(arr[r][k + 3]))
                                    && (arr[r][k].equals(arr[r][k + 4]))) {
                                omok = true;
                                break;
                            }
                            if ((arr[k][c].equals(arr[k + 1][c])) && (arr[k + 1][c].equals(arr[k + 2][c]))
                                    && (arr[k][c].equals(arr[k + 3][c]))
                                    && (arr[k][c].equals(arr[k + 4][c]))) {
                                omok = true;
                                break;
                            }

                        }
                        if ((r + 5 <= N) && (c + 5 <= N)) {
                            if ((arr[r][c].equals(arr[r + 1][c + 1])) && (arr[r][c].equals(arr[r + 2][c + 2]))
                                    && (arr[r][c].equals(arr[r + 2][c + 2])) && (arr[r][c].equals(arr[r + 4][c + 4]))) {
                                omok = true;
                                break;
                            }

                        }
                        if ((r + 5 <= N) && (c >= 4)) {
                            if ((arr[r][c].equals(arr[r + 1][c - 1]))
                                    && (arr[r][c].equals(arr[r + 2][c - 2]))
                                    && (arr[r][c].equals(arr[r + 3][c - 3]))
                                    && (arr[r][c].equals(arr[r + 4][c - 4]))) {
                                omok = true;
                                break;
                            }
                        }

                    }

                }

            }
            if (omok == true) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }

        }
        System.out.println(sb);
        sc.close();
    }
}
