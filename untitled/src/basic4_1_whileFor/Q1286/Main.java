package basic4_1_whileFor.Q1286;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int max = arr[arr.length-1];
        int min = arr[0];
        System.out.println(max+"\n"+min);

    }
}
