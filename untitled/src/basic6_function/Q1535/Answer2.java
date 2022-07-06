package basic6_function.Q1535;

import java.util.Scanner;

public class Answer2 {

    static int n;
    static int[] d = new int[101];

    static int f() {
        int max = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            if(d[i]> max ) {
                max = d[i]; // 제일 큰값 찾기
            }
        }
        for (int i = 0; i < n; i++) {
            if(d[i]==max) {
                result = i+1;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            d[i]= sc.nextInt();
        }
        System.out.println(f());
    }
}