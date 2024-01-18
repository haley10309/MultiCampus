package Forth_week;


import java.io.IOException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class solution1204 {
    public static void main(String[] args) throws IOException {
        //System.setIn(new FileInputStream("Class_Excercise/res/input .txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        // String trash = sc.nextLine();

        System.out.println(sb);
        for (int test_case = 1; test_case <= T; test_case++) {
            HashMap<Integer, Integer> freq_map = new HashMap<>();
            int test_order = sc.nextInt();
            
            for (int i = 0; i < 1000; i++) {
                int new_num = sc.nextInt();
                if (freq_map.containsKey(new_num)) {
                    freq_map.put(new_num, freq_map.get(new_num) + 1);

                } else {
                    freq_map.put(new_num, 1);
                }
            }
            List<Integer> key_set = new ArrayList<>(freq_map.keySet());
            key_set.sort(new Comparator<Integer>() {

                @Override
                public int compare(Integer o1, Integer o2) {
                    return freq_map.get(o1).compareTo(freq_map.get(o2));
                }

            });
            sb.append("#" + test_order + " ").append(key_set.get(freq_map.size()-1)).append("\n");

        }
        System.out.println(sb);

    }
}
