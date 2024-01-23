import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class freq_1204 {
    public static void main(String args[]) throws Exception {

        System.setIn(new FileInputStream("Class_Excercise/res/input_1204.txt"));
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            Map<Integer, Integer> freq = new HashMap<>();
            int num = sc.nextInt();
            sb.append("#").append(num).append(" ");
            for (int i = 0; i < 1000; i++) {
                int input = sc.nextInt();
                if (freq.containsKey(input)) {
                    freq.put(input, freq.get(input) + 1);
                } else {
                    freq.put(input, 1);
                }

            }
            int most_freq_value = 0;
            int most_freq_key = 0;
            List<Integer> equal_value = new ArrayList<>();
            Iterator<Integer> keys = freq.keySet().iterator();
            while (keys.hasNext()) {
                Integer Key = keys.next();
                Integer Value = freq.get(Key);
                if (most_freq_value == Value) { // 빈도수가 같을 때
                    if (most_freq_key < Key) { // 더 큰 수를 저장
                        most_freq_key = Key;
                        most_freq_value = Value;
                    }
                }
                if (most_freq_value < Value) {

                    most_freq_key = Key;
                    most_freq_value = Value;
                }
            }
            int result = most_freq_key;
            sb.append(result).append("\n");
        }
        System.out.println(sb);

    }
}
