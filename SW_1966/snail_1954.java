import java.io.FileInputStream;
import java.util.Scanner;

public class snail_1954 {
    static int[] dr = { 0, 1, 0, -1 };
    static int[] dc = { 1, 0, -1, 0 };

    public static void main(String args[]) throws Exception {

        System.setIn(new FileInputStream("Class_Excercise/res/input1954.txt"));

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int test_order = sc.nextInt();
            int[][] arr = new int[test_order][test_order];
            int d = 0; // 방향
            int r = 0, c = 0; // 현재 좌표 , 나의 좌표 초기화[0,0]

            sb.append("#" + test_case).append("\n");
            for (int i = 1; i <= test_order * test_order; i++) {
                arr[r][c] = i;
                int nr = r + dr[d]; //새로운 좌표 생성
                int nc = c + dc[d]; //새로운 좌표 생성
                // 범위 안에 없으면 ㄱ
                if (nr < 0 || nr >= test_order || nc < 0 || nc >= test_order || arr[nr][nc] != 0) {
                    d = (d + 1) % 4; // 방향 바꾸기
                    nr = r + dr[d]; //다시 새로운 좌표 생성
                    nc = c + dc[d]; //다시 새로운 좌표 생성 
                }
                r = nr; //새로운 좌표를 현재 좌표계에 입력
                c = nc; //새로운 좌표를 현재 좌표계에 입력
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