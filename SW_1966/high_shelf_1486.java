import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class high_shelf_1486 {
    static int shelf_hight;
    static List<Integer> higher_sum;
    static int[] workers_hight;
    static int worker_num;

    public static void main(String args[]) throws Exception {

        System.setIn(new FileInputStream("Class_Excercise/res/input_1486.txt"));

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T;
        T = sc.nextInt();
        
        String trash = sc.nextLine();
        for (int test_case = 1; test_case <= T; test_case++) {
            sb.append("#" + test_case + " ");
            // N(직원들의 수), B(선반의 높이)
            String[] line = sc.nextLine().split(" ");
            worker_num = Integer.parseInt(line[0]);
            shelf_hight = Integer.parseInt(line[1]);
            workers_hight = new int[worker_num];
            higher_sum = new ArrayList<>();
            String[] workers_hight_line = sc.nextLine().split(" ");
            for (int i = 0; i < worker_num; i++) {
                workers_hight[i] = Integer.parseInt(workers_hight_line[i]);
            }

            for (int i = 0; i < worker_num; i++) {
                int sum = 0;
                Dfs(i, sum);
            }
            Collections.sort(higher_sum);
            sb.append(higher_sum.get(0) - shelf_hight + "\n");

        }
        System.out.println(sb);
    }

    private static void Dfs(int i, int sum) {
        if(sum>=shelf_hight){
            higher_sum.add(sum);
            return;
        }
        if(i == worker_num){
            if(sum>=shelf_hight){
                higher_sum.add(sum);
                
            }
            return;
        }

        Dfs(i+1, sum);
        Dfs(i+1, sum+workers_hight[i] );


    }
}
