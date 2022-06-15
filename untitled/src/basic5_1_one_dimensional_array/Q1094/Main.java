package basic5_1_one_dimensional_array.Q1094;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //번호를 부른 횟수

        int[] arr = new int[n]; //n의 크기만큼의 배열 생성

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); //n개의 랜덤 번호 입력
        }
        /*
        tmp변수에 arr[i]을 저장한 후, arr[i]의 값에 arr[arr.length - i - 1] 위치에 있는 값을 넣어준다.
        그리고 arr[arr.length - i - 1] 위치에는 tmp에 저장된 arr[i]의 값을 넣어준다.
        */
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        //배열의 순서를 다 바꿨다면, for문을 이용해 배열의 값을 각각 출력한다.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
