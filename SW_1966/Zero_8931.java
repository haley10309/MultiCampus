import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Stack;

public class Zero_8931 {
    public static void main(String args[]) throws Exception {

        System.setIn(new FileInputStream("Class_Excercise/res/sample_input_8931.txt"));
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        
        for (int test_case = 1; test_case <= T; test_case++) {
            Stack<Integer> stack = new Stack<>();
            int num = sc.nextInt();
            int sum = 0;
            for(int i =0 ; i<num ;i++){
                int new_num = sc.nextInt();
                if(new_num==0){
                    stack.pop();
                }else{
                    stack.push(new_num);
                }
            }
            while(!stack.isEmpty()){
                sum += stack.pop();
            }
            sb.append("#"+test_case+" ").append(sum).append("\n");
            
        }
        System.out.println(sb);
    }
}
