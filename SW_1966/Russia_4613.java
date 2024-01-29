import java.io.FileInputStream;
import java.util.Scanner;

public class Russia_4613 {
    public static void main(String args[]) throws Exception {

        System.setIn(new FileInputStream("Class_Excercise/res/sample_input4613.txt"));

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T;
        T = sc.nextInt();

        String trash = sc.nextLine();
        for (int test_case = 1; test_case <= T; test_case++) {
            String[] line = sc.nextLine().split(" ");
            int row = Integer.parseInt(line[0]);
            int col = Integer.parseInt(line[1]);
            String[][] arr = new String[row][col];
            for (int i = 0; i < row; i++) {
                String[] text_row = sc.nextLine().split("");
                for (int j = 0; j < col; j++) {
                    arr[i][j] = text_row[j];

                }

            }
            int color_count = new_Color(arr);

            sb.append("#" + test_case + " ").append(color_count + "\n");

        }
        System.out.println(sb);
    }

    private static int new_Color(String[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int min = row * col;
        String[][] original_flag = new String[row][col];

        int un_match = 0;

        int w, b, r;

        for (w = 1; w <= row - 2; w++) {
            for (b = 1; b <= row - w - 1; b++) {
                r = row - w - b;

                for (int j = 0; j < w; j++) {
                    for (int k = 0; k < col; k++) {
                        original_flag[j][k] = "W";
                    }
                }
                for (int j = w; j < w + b; j++) {
                    for (int k = 0; k < col; k++) {
                        original_flag[j][k] = "B";
                    }
                }
                for (int j = w + b; j < row; j++) {
                    for (int k = 0; k < col; k++) {
                        original_flag[j][k] = "R";
                    }
                }
                /* =============예시 깃발 완성================ */
                for (int i = 0; i < original_flag.length; i++) {
                    for (int j = 0; j < original_flag[i].length; j++) {
                        if (!original_flag[i][j].equals(arr[i][j])) {
                            un_match++;
                        }
                    }
                }
                if (min > un_match) {
                    min = un_match;
                }

            }
        }

        return min;
    }
}
