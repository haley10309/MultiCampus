import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class huiwen1215 {
    public static void main(String args[]) throws Exception {

        System.setIn(new FileInputStream("Class_Excercise/res/input_1215.txt"));

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        /*
         * 여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
         */

        for (int test_case = 1; test_case <= 10; test_case++) {
            String[][] arr = new String[8][8];
            Map<String, Integer> map = new HashMap<>();
            int hui_neng = 0;

            sb.append("#").append(test_case).append(" ");
            int huiwen_length = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < 8; i++) {
                String[] text = sc.nextLine().split("");
                for (int j = 0; j < 8; j++) {
                    arr[i][j] = text[j];
                }
            }
            for (int i = 0; i < (8) ; i++) {
                for (int j = 0; j < (8 - huiwen_length) + 1; j++) {
                    /* =================가로 비교================ */
                    String text = "";
                    String text_reverse = "";
                    for (int k = 0; k < huiwen_length; k++) { // 한 줄을 입력 받아
                        text = text + arr[i][j + k];
                    }
                    for (int k = text.length() - 1; k >= 0; k--) { // 반대 문자열을 만들어서
                        text_reverse = text_reverse + text.charAt(k);
                    }
                    if (text.equals(text_reverse)) {
                        hui_neng++;
                    }

                    /* =================세로 비교================ */
                    text = "";
                    text_reverse = "";
                    for (int k = 0; k < huiwen_length; k++) { // 한 줄을 입력 받아
                        text = text + arr[j + k][i];
                    }
                    for (int k = text.length() - 1; k >= 0; k--) { // 반대 문자열을 만들어서
                        text_reverse = text_reverse + text.charAt(k);
                    }
                    if (text.equals(text_reverse)) {
                        hui_neng++;
                    }
                    

                }
            }
            
            
            sb.append(hui_neng).append("\n");
        }
        System.out.println(sb);
    }
}
