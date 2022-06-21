package basic5_1_one_dimensional_array.Q1425;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();//학생수
        int b = sc.nextInt();//한줄 자리수
        int[] a = new int[s];//학생 키담는 배열
        int temp;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {//오름차순 정렬
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 1; i <= s; i++) {
            System.out.print(a[i - 1] + " ");
            if (i % b == 0) System.out.println();
        }
    }//main end
}