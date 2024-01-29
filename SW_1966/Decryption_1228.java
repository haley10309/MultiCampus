import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class Decryption_1228 {
    public static void main(String args[]) throws Exception {

        System.setIn(new FileInputStream("Class_Excercise/res/input_1228.txt"));

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        for (int test_case = 1; test_case <= 10; test_case++) {
            sb.append("#" + test_case + " ");
            int original_password_length = Integer.parseInt(sc.nextLine()); // 1. 원 암호문의 길이
            LinkedList<String> list = new LinkedList<>();
            String[] original_password_line = sc.nextLine().split(" ");

            for (int i = 0; i < original_password_length; i++) { // 원문 암호 입력 받기
                list.add(original_password_line[i]);
            }
            int order_num = Integer.parseInt(sc.nextLine()); // 전체 명령어들의 갯수
            String[] order = sc.nextLine().split("I"); // 전체 명령어들을 하나씩 나눈 배열

            for (int i = 1; i < order_num+1; i++) {
                String[] order_context = order[i].split(" "); // 하나의 명령어를 구성하고 있는 (삽입 위치, 삽입될 숫자의 갯수, 숫자들)
                int insert_point = Integer.parseInt(order_context[1]); // 삽입 위치
                int insert_num_count = Integer.parseInt(order_context[2]);// 삽입될 숫자의 갯수
                String[] number = new String[insert_num_count];// 숫자들
                for (int j = 3; j < insert_num_count + 3; j++) {
                    number[j - 3] = order_context[j];
                }
                for (int j = 0; j < insert_num_count; j++) { // 명령어 수행
                    list.add(insert_point + j, number[j]);
                }

            }
            for (int i = 0; i < 10; i++) {
                sb.append(list.get(i) + " ");
            }

            sb.append("\n");

        }
        System.out.println(sb);
        sc.close();
    }
}
