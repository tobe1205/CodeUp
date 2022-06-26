package basic5_4_sort_data.Q4501;

import java.util.Arrays;
import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] n = new int[7];
        //난쟁이 7명 받기
        for(int i = 0; i < n.length; i++) {
            n[i] = scan.nextInt();
        }
        for (int i = n.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (n[j] < n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(n));
    }
}
