import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class clap_1926 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        /*
         * 여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
         */
        String[] clap_num = { "3", "6", "9" };
        List<Character> list = new ArrayList<>(Arrays.asList('3', '6', '9'));

        for (int test_case = 1; test_case <= T; test_case++) {
            String test_index = Integer.toString(test_case);
            char[] char_test = new char[test_index.length()];
            if (test_index.contains(clap_num[0]) || test_index.contains(clap_num[1])
                    || test_index.contains(clap_num[2])) {
                for (int j = 0; j < test_index.length(); j++) {
                    char_test[j] = test_index.charAt(j);

                    if (list.contains(char_test[j])) {
                        System.out.print("-");
                    }

                }
            }else{
                System.out.print(test_index);
            }
            System.out.print(" ");
        }
    }
}
