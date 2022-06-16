package basic5_1_one_dimensional_array.Q1409;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10]; //10개의 숫자를 저장할 배열

        for (int i = 0; i < arr.length; i++) { //0~9까지 반복
            arr[i] = sc.nextInt(); //배열에 입력한 값 저장
        }
        int k = sc.nextInt(); //몇번째인지 입력한 정수를 변수 k에 저장
        System.out.print(arr[k-1]); //배열의 k-1번째 값 출력
                                    //-1을 하는 이유는 사용자에겐 1부터지만
                                    // 자바에서는 0부터 시작이기 때문
        sc.close();
    }
}
