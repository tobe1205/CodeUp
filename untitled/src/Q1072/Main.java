package Q1072;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //n개의 정수 입력
        int n = sc.nextInt();

        int[] arr = new int[n];

        // 반복문 실행으로 배열안에 각각 입력받고, 배열값 출력
        for (int i : arr) {
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
