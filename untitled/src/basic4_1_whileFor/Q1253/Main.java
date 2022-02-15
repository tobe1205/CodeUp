package basic4_1_whileFor.Q1253;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int tmp;

        if (a>b){
            tmp = a;
            a = b;
            b = tmp;
        }
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
    }
}
