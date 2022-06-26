package basic5_4_sort_data.Q4501;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = arr.length - 1; i > 4; i--) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
