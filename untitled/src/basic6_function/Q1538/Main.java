package basic6_function.Q1538;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        f(n);
    }

    static void f(int n) {
        if (n % 2 != 0) { //홀수
            System.out.print("odd");
        } else {
            System.out.print("even");
        }
    }
}