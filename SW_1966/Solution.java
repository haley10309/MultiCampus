import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("Class_Excercise/res/input.txt"));

		/*
		 * 표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		/*
		 * 여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		 */

		for (int test_case = 1; test_case <= T; test_case++) { //전체 테스트 케이스 갯수
			int count = sc.nextInt();
			int[] arr_num = new int[count];
			
			for(int i =0;i<arr_num.length ;i++){ //숫자 정렬 읽어 오는 반복문
				arr_num[i] = sc.nextInt();
			}
			Arrays.sort(arr_num);
			System.out.print("#"+test_case);
			for(int i = 0 ; i<arr_num.length ;i++){
				System.out.print(" " + arr_num[i]);
			}
			System.out.println("");
		}
	}
}