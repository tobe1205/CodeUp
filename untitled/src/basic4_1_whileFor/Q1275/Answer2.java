package basic4_1_whileFor.Q1275;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int num = 1;

        for (int i = 1; i <= k; i++) {
            num *= n;
        }
        System.out.print(num);
    }
}
