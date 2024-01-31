import java.io.FileInputStream;
import java.util.Scanner;

public class Dessert_2105 {
    // 좌상, 좌하, 우하, 우상
    static int[] dr = { -1, -1, 1, 1 };
    static int[] dc = { -1, 1, 1, -1 };

    public static void main(String args[]) throws Exception {
        System.setIn(new FileInputStream("Class_Excercise/res/sample_input_2105.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int num = sc.nextInt();
            int[][] line = new int[num][num];
            for(int i = 0 ;i<num ; i++){//입력 받기
                for(int j = 0 ;j<num ;j++){
                    line[i][j] = sc.nextInt();
                }
            }
            for(int i = 0 ;i<num ;i++){
                for(int j = 0 ;j<num ;j++){
                    if((i>=1&&i<=(num-2))||(j>=1&&j<=(num-2))){

                    }
                }
            }
        }
    }
}
