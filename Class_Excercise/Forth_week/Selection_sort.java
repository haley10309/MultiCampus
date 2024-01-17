package Forth_week;

import java.io.IOException;
import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args)throws IOException{
        int[] bubble = { 42, 32, 24, 68, 15 };
        
        for(int i = 0 ;i<bubble.length-1;i++){ //고정된 작은 값 맨 앞에 고정
            int small = i;
            for(int j=i+1;j<bubble.length;j++){
                if(bubble[i] > bubble[j]){
                    int temp = bubble[i];
                    bubble[i] = bubble[j];
                    bubble[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(bubble));
    }
}
