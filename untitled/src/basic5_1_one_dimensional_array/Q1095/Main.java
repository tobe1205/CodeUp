package basic5_1_one_dimensional_array.Q1095;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //부른 횟수

        int[] arr = new int[n]; //부른 횟수만큼 번호 입력


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0]; //최소값

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) { //arr[i]의 값이 min보다 작으면
                min = arr[i]; //min = arr[i]
            }
        }
        //마지막 최소값 출력
        System.out.print(min);
    }
}
