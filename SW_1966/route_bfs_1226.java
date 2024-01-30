import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class route_bfs_1226 {
    // delta 검색
    static int[] dr = { -1, 0, 1, 0 };
    static int[] dc = { 0, 1, 0, -1 };
    static char[][] map;
    static boolean[][] visited;
    static int answer;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("Class_Excercise/res/input_1226.txt"));
        Scanner sc = new Scanner(System.in);
        int T;
        T = 10;
        // 상우하좌

        for (int test_case = 1; test_case <= T; test_case++) {
            int t = sc.nextInt();
            // 16*16 사이즈라고 문제에 언급
            map = new char[16][16];
            visited = new boolean[16][16];
            // map 정보 입력 완료
            for (int i = 0; i < 16; i++) {
                map[i] = sc.next().toCharArray();
            }
            Queue<int[]> queue = new LinkedList<>();
            int answer = 0; // 갈 길이 없으면 0 , 있으면 1
            visited[1][1] = true; //여기서 방문했다는 것
            //1,1 시작 좌표를 queue에 넣어준다
            queue.add(new int[] {1,1}); 
            while(!queue.isEmpty()){
                int[] now = queue.poll();
                for(int i = 0 ;i<4;i++){
                    int nr = now[0] + dr[i];
                    int nc = now[1] + dc[i];
                    //범위 안에 있다면
                    if(nr >= 0 && nr <16 && nc >=0 &&nc<=16){
                        if(map[nr][nc]!= '1'&& !visited[nr][nc]){
                            queue.add(new int[] {nr,nc});
                            visited[nr][nc] = true;
                            if(map[nr][nc]=='3'){
                                answer = 1;
                                break;
                            }
                            
                        }
                    }
                }
            }
            System.out.println("#"+test_case+" "+answer);

        }
    }
}
