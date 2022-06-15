package basic5_1_one_dimensional_array.Q1403;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt(); //입력할 값의 갯수

        int[] arr = new int[k];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
