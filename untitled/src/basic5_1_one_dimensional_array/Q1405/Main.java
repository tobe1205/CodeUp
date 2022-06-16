package basic5_1_one_dimensional_array.Q1405;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 숫자의 갯수

        int[] arr = new int[n]; //갯수만큼의 int배열 생성

        //n개의 정수를 배열안에 각각 입력 후 저장
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //배열에 저장되어 있는 값을 하나씩 출력하되, j = i로 해서
        //i가 증가할 때마다 시작이 달라지게 된다.
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print(arr[j]+ " ");
            }
            //j < i i가증가하면 j가 수행해야하는 범위가 늘어나면서
            //로테이션되고 난 후 뒤에 나와야 하는 숫자들을 출력하게 한다.
            for (int j = 0; j < i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }

    }
}
