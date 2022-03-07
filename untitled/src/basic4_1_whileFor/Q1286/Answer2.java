package basic4_1_whileFor.Q1286;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0]; //최댓값 비교를 위한 변수
        int min = arr[0]; //최솟값 비교를 위한 변수

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
