package basic5_1_one_dimensional_array.Q1093;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[23]; //출석번호 23번까지

        int n = sc.nextInt(); //출석번호를 부른 횟수

        /*n번의 횟수까지 번호를 입력하면, 해당 번호-1의
        배열 위치에 숫자를 1씩 증가시킨다.
        이 때, arr[num-1]을 하는 이유는 0~22까지의 자리가 아닌
        1부터 23번까지이기때문에 -1을 해주어서 한칸씩 땡겨줘야 한다.
        */
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[num-1]++;
        }
        /*
        번호를 다 부르게 되면, for문을 이용해서 배열의 크기만큼
        각각의 값을 하나씩 출력한다.
         */
        for (int i = 0; i < arr.length ; i++) {
            System.out.printf("%d ",arr[i]);
        }
        sc.close();
    }
}
