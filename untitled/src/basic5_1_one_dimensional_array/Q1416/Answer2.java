package basic5_1_one_dimensional_array.Q1416;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[500]; //숫자가 길수 있으므로, 배열을 크게 잡았다.

        int n = sc.nextInt();

        if (n == 0) System.out.println(0); //입력된 값이 0일경우 그대로 0출력

        int i = 0;
        while (n > 0) { //입력받은값이 0보다 클때까지 반복
            arr[i] = n % 2; // n값을 나눈 나머지를 arr[i]에 각각 저장
            n /= 2; //저장 후 나누기 2
            i++; // i 값 증가 배열의 위치 변경
        }
        //while문이 종료되면 출력해야한다.
        //이때 자리수가 반대로 되어있기 때문에, 배열의 맨 마지막위치부터 먼저 출력해야한다.
        for (int j = i - 1; j >= 0; j--) { //i-1(마지막배열)부터 0번위치까지
            System.out.print(arr[j]);
        }
    }
}
