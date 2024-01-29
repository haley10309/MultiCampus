import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Decryption3_1230 {
    public static void main(String args[]) throws Exception {

        System.setIn(new FileInputStream("Class_Excercise/res/input_1230.txt"));

        Scanner sc = new Scanner(System.in);
        int T = 10;
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
            String[] order = sc.nextLine().split(" "); // 전체 명령어들을 하나씩 나눈 배열
            Queue<String> que = new LinkedList<>();
            for (int i = 0; i < order.length; i++) {
                que.add(order[i]);

            }
            while (!que.isEmpty()) {
                String type = que.poll();
                if (type.equals("I")) { // 명령문 유형 -> 명령문 수행
                    int insert_point = Integer.parseInt(que.poll());// 삽입 위치
                    int insert_num_count = Integer.parseInt(que.poll());// 삽입될 숫자의 갯수
                    for (int j = 0; j < insert_num_count; j++) {
                        String number = que.poll();// 숫자들
                        list.add(insert_point + j, number);
                    }
                } else if (type.equals("D")) {
                    int delete_point = Integer.parseInt(que.poll());
                    int delete_num_count = Integer.parseInt(que.poll());
                    for (int j = 0; j < delete_num_count; j++) {
                        list.remove(delete_point);
                    }
                } else if (type.equals("A")) {
                    int add_num_count = Integer.parseInt(que.poll());
                    for (int j = 0; j < add_num_count; j++) {
                        String number = que.poll();// 숫자들
                        list.add(number);
                    }
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
