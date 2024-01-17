package Forth_week;

import java.io.IOException;
import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) throws IOException {
        int[] bubble = { 42, 32, 24, 68, 15 };

        for (int i = bubble.length - 1; i > 0; i--) { // 마지막에 고정 시킬 값
            for (int j = 0; j < i; j++) { // 비교를 시작할 값
                if (bubble[j] > bubble[j + 1]) {
                    int temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(bubble));
    }
}
