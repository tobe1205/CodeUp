package Q1170_Q1173.Q1172;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt();
        }
        //오름차순 정렬
        Arrays.sort(arr);

        //정렬 된 값들을 문자열로 변환 하고 띄어쓰기와 함께 출력
        for (int i : arr) {
            System.out.print(String.valueOf(i) + " ");
        }

    }
}
