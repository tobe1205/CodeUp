package basic6_function.Q1550;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.println(sqrt(n));

    }

    private static long sqrt(long n) {
        return (int) Math.sqrt(n);
    }
}
