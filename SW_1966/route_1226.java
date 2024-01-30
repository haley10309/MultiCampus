import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class route_1226 {
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
            //16*16 사이즈라고 문제에 언급
            map = new char[16][16];
            visited = new boolean[16][16];
            //map 정보 입력 완료
            for(int i  =0;i<16;i++){
                map[i]  = sc.next().toCharArray();
            }
            answer = 0;
            DFS(1, 1);
            System.out.println("#"+t+" "+answer);
            
        }
    }
    //매개변수로 넘겨지는 값은 내가 앞으로 보고 있는 행, 열의 좌표
    private static void DFS(int row , int col){
        //함수가 실행되는 시점에 방문했는지 체크
        //방문했으면 함수 종료, 아니면 진행
        if(map[row][col] == '1'||visited[row][col]){
            return;
            
        }
        //방문처리
        visited[row][col] = true;
        if(map[row][col]=='3'){
            answer = 1;
            return;
        }
        for(int i = 0 ;i<4;i++){
            int nr = row + dr[i];
            int nc = col + dc[i];
            DFS(nr, nc);
        }

    }
}
