import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class kill_fly2001 {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("Class_Excercise/res/input_2001.txt"));
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int entire_scape = sc.nextInt();
            int kilable_scape = sc.nextInt();
            int[][] fly_arr = new int[entire_scape][entire_scape];
            for (int i = 0; i < entire_scape; i++) {
                for (int j = 0; j < entire_scape; j++) {
                    fly_arr[i][j] = sc.nextInt();
                }
            }
            ArrayList<Integer> kill_list = new ArrayList<>();
            for (int i = 0; i <= (entire_scape - kilable_scape); i++) {
                for (int y = 0; y <= (entire_scape - kilable_scape); y++) {

                    int fly_num = 0;
                    for (int j = i; j < i + kilable_scape; j++) {
                        for (int k = y; k < y + kilable_scape; k++) {
                            fly_num = fly_num + fly_arr[j][k];
                        }
                    }

                    kill_list.add(fly_num);
                }
            }
            Collections.sort(kill_list);
            sb.append("#").append(test_case).append(" ").append(kill_list.get(kill_list.size() - 1)).append("\n");
        }
        System.out.println(sb);
    }
}
