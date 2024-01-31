import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BungwaBBang_1860 {
    public static void main(String args[]) throws Exception {

        System.setIn(new FileInputStream("Class_Excercise/res/input__1860_new.txt"));

        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int people_num = sc.nextInt(); // 예약한 사람들의 수
            int time_per_once = sc.nextInt(); // 한번에 만들때 드는 시간 (초)
            int bread_num_per_once = sc.nextInt();// 한번에 만드는 붕어빵의 수
            int[] time_people_arrive = new int[people_num]; // 사람들이 도착할 시간 (초)
            List<Long> time_bread_made = new ArrayList<>(); // 빵마다 만들어진 시간의 기록

            for (int i = 0; i < people_num; i++) {
                time_people_arrive[i] = sc.nextInt();
            }
            Arrays.sort(time_people_arrive);

            boolean wait = true; // 손님들이 붕어빵을 바로 찾아갈 수 있을 것이냐의 여부 (true == 불가능)
            int work_count = 1; // 최소 기계를 돌려야 할 횟수

            while (bread_num_per_once * work_count <= people_num) {
                work_count++;
            }
            work_count++;
            

            if (time_people_arrive[0] >= time_per_once) { // 첫 번째 사람이 오기전에 첫 번째 기계를 돌릴 수 있는 가
                wait = false;
                // ===================빵이 만들어지는 시간을 기록
                Long time_sum = (long)time_per_once;
                for (int i = 0; i < work_count; i++) { // 최소 기계를 돌려야 하는 횟수
                    time_sum = time_sum + (time_per_once * i);
                    for (int j = 0; j < bread_num_per_once; j++) { // 한번 만들 때 만들어지는 붕어빵의 개수
                        time_bread_made.add(time_sum);

                    }
                }
                // ===================사람들이 오는 시간과 비교
                for (int i = 0; i < time_people_arrive.length; i++) {
                    if (time_people_arrive[i] >= time_bread_made.get(i)) {
                        wait = false;
                    } else {
                        wait = true;
                        break;
                    }
                }
            }
            if (wait == true) {
                sb.append("#" + test_case + " Impossible\n");

            } else {
                sb.append("#" + test_case + " Possible\n");
            }

        }
        System.out.println(sb);
        sc.close();
    }
}
