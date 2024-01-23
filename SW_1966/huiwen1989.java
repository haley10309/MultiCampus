import java.io.FileInputStream;
import java.util.Scanner;

public class huiwen1989 {
    public static void main(String args[]) throws Exception {

        System.setIn(new FileInputStream("Class_Excercise/res/input_1989.txt"));
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String trash = sc.nextLine();
        for (int test_case = 1; test_case <= T; test_case++) {
            sb.append("#").append(test_case).append(" ");
            String line = sc.nextLine();
            String line_reverse = "";
            for (int j = line.length() - 1; j >= 0; j--) {
                line_reverse = line_reverse + line.charAt(j);
            }
            if (line.equals(line_reverse)) {
                sb.append(1).append("\n");

            } else {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }
}
