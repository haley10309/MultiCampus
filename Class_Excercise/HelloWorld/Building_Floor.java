package HelloWorld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Building_Floor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        System.out.println("1층부터 5층까지 선택해주세요: ");
        int floor = Integer.parseInt(br.readLine());
        String[] floor_name = { "약국", "정형외과", "피부과", "치과", "헬스장" };
        // switch (floor) {
        //     case 1:
        //         sb.append(floor).append("층 ").append(floor_name[floor - 1]).append("입니다.");
        //         break;
        //     case 2:
        //         sb.append(floor).append("층 ").append(floor_name[floor - 1]).append("입니다.");
        //         break;
        //     case 3:
        //         sb.append(floor).append("층 ").append(floor_name[floor - 1]).append("입니다.");
        //         break;
        //     case 4:
        //         sb.append(floor).append("층 ").append(floor_name[floor - 1]).append("입니다.");
        //         break;
        //     case 5:
        //         sb.append(floor).append("층 ").append(floor_name[floor - 1]).append("입니다.");
        //         break;

        // }
        sb.append(floor).append("층 ").append(floor_name[floor - 1]).append("입니다.");
        System.out.println(sb);
        br.close();

    }
}
