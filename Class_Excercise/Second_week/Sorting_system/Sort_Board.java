package Second_week.Sorting_system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Sort_Board {
    public static void main(String[] args)throws IOException{
        Sort sort = null;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =new StringBuilder();


        System.out.println("숫자 정렬 방식을 선택하세요: ");
        System.out.println("Q: Quick Sort");
        System.out.println("B: Bubble Sort");
        System.out.println("H: Heap Sort");


        char reply = br.readLine().toUpperCase().charAt(0);
        if(reply == 'Q'){
            sort = new QuickSort();
        }else if (reply == 'B'){
            sort = new BubbleSort();
        }else if(reply == 'H'){
            sort = new HeapSort();
        }else{
            System.out.println("지원되지 않는 기능입니다.");
            return;
        }
        System.out.println("정렬하고자 하는 숫자들을 한 글자씩 띄워서 입력해주세요.: ");

        ArrayList<Integer> num = new ArrayList<>();
        String[] line = br.readLine().split(" ");
        int[] arr_int = new int[line.length];
        
        for(int i = 0 ;i<line.length ;i++){
            arr_int[i]=Integer.valueOf(line[i]);
            
        }
        sort.ascending(arr_int);
        sort.descending(arr_int);
        sort.description();
    }
}
