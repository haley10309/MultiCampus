import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Stack;

public class stack_1289 {
    public static void main(String args[]) throws Exception {

        System.setIn(new FileInputStream("Class_Excercise/res/input_1289.txt"));
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        String trash = sc.nextLine();
        for (int test_case = 1; test_case <= T; test_case++) {
            Stack<Integer> origin_mem = new Stack<>();

            String[] line = sc.nextLine().split("");
            int index = 0;
            int change_count = 0;

            for (int i = 0; i < line.length; i++) {
                origin_mem.push(Integer.parseInt(line[i]));
                if ((i == 0) && (origin_mem.peek() == 0)) {//첫번째가 0이면 -1
                    change_count--;
                }
                if((i==line.length-1)&&(origin_mem.peek()==0)){
                    change_count++;
                }

            }

            for (int i = 0; i < line.length; i++) {
                int pop_num = origin_mem.pop();
                if (pop_num == index) {
                } else {

                    index = pop_num;
                    change_count++;

                }

            }
            sb.append("#").append(test_case).append(" ").append(change_count).append("\n");

        }
        System.out.println(sb);
    }

}
