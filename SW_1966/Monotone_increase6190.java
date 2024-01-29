import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Monotone_increase6190 {
    public static void main(String args[]) throws Exception {

        System.setIn(new FileInputStream("Class_Excercise/res/s_input_6190.txt"));
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        String trash = sc.nextLine();
        for (int test_case = 1; test_case <= T; test_case++) {
            sb.append("#").append(test_case + " ");
            int num = Integer.parseInt(sc.nextLine());
            int[] arr = new int[num];
            String[] line = sc.nextLine().split(" ");

            for (int i = 0; i < num; i++) {
                arr[i] = Integer.parseInt(line[i]);
            }

            int max = -1;
            for (int i = 0; i < num; i++) {
                for (int j = i + 1; j < num; j++) {
                    int multi_num = arr[i] * arr[j];
                    if (isIncreasing(multi_num) && (multi_num > max)) {
                        max = multi_num;
                    }

                }
            }
            sb.append(max+"\n");
        }
        System.out.println(sb);
        sc.close();
    }

    static boolean isIncreasing(int multi_num) {
        int before_number = 9;
        for (int i = multi_num; i > 0; i = i / 10) {
            int one_number = i % 10;
            if (one_number > before_number) {
                return false;
            } else {
                before_number = one_number;
            }
        }
        return true;
    }

}
