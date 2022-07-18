package basic6_function.Q1555;

import java.util.Scanner;

public class Main {
    static long sum;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(f(n));

    }

    private static long f(int n) {
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
