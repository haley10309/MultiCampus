import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class problem_Title7087 {
    public static void main(String args[]) throws Exception {

        System.setIn(new FileInputStream("Class_Excercise/res/sample_input7087.txt"));
        StringBuilder sb = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        String trash = sc.nextLine();

        for (int test_case = 1; test_case <= T; test_case++) {
            sb.append("#").append(test_case).append(" ");
            int subject_num = Integer.parseInt(sc.nextLine());
            String[] subject = new String[subject_num];
            for (int i = 0; i < subject_num; i++) {
                subject[i] = sc.nextLine();
            }
            Arrays.sort(subject);
            
            int result = 0;
            boolean done = true;
            int index = 0 ; 
            if(subject[0].charAt(0)=='A'){
                result++;
                for(int i = 1;i<subject.length;i++){
                    char index_char =subject[i].charAt(0);
                    char before = subject[i-1].charAt(0);
                    char suppose_before = (char)(index_char-1);
                    char suppose_index = (char)(before+1);
                    
                    if(index_char==before){
                        
                    }else if (suppose_index==index_char){
                        result ++;
                        //sb.append(suppose_index+" ").append(" ");

                    }else{
                        break;
                    }
                   
                }
            }
            sb.append(result).append("\n");

        }
        System.out.println(sb);
    }
}
