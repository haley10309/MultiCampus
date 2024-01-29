import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class perfectShuffle_3499 {
    public static void main(String args[]) throws Exception {

        System.setIn(new FileInputStream("Class_Excercise/res/sample_input_3499.txt"));

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T;
        T = sc.nextInt();
        String trash = sc.nextLine();
        for (int test_case = 1; test_case <= T; test_case++) {
            sb.append("#").append(test_case + " ");
            int card_num = Integer.parseInt(sc.nextLine());
            int q_1_length = 0;
            if(card_num%2==0){
                 q_1_length = (card_num / 2);
            }else{
                q_1_length = (card_num+1)/2;
            }
            
            Queue<String> q_1 = new LinkedList<>();
            Queue<String> q_2 = new LinkedList<>();
            String[] line = sc.nextLine().split(" ");
            for (int i = 0; i < q_1_length; i++) {
                q_1.add(line[i]);
            }
            for (int i = q_1_length; i < card_num; i++) {
                q_2.add(line[i]);
            }

            while ((!q_1.isEmpty()) || (!q_2.isEmpty())) {
                if (!q_1.isEmpty()) {
                    sb.append(q_1.poll()).append(" ");
                }
                if (!q_2.isEmpty()) {
                    sb.append(q_2.poll()).append(" ");
                }
            }
            sb.append("\n");

        }
        System.out.println(sb);
    }
}
