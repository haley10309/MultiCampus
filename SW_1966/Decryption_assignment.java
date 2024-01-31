import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Decryption_assignment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] encrypted_word = br.readLine().split(""); // 암호화된 문자열
        String[] key = br.readLine().split(""); // 키 문자열
        Queue<String> que = new LinkedList<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < encrypted_word.length; i++) { // 암호화된 문자열을 List화
            list.add(encrypted_word[i]);
        }
        for (int i = 0; i < key.length; i++) {// 키 문자열을 큐 화
            que.add(key[i]);
        }
        String eliminate_word = que.poll();
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).equals(eliminate_word)) {
                list.remove(i);
                if (!que.isEmpty()) {
                    eliminate_word = que.poll();
                }else{
                    break;
                }

            }
        }
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }

        System.out.println(sb);

    }
}
// 입력 예시
// xayazbxbxczczyx
// aabbcc

// baabccbc
// abc
