package basic6_function.Q1554;

import java.util.Scanner;

public class Main {
    static double x;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        x = sc.nextDouble(); //실수형 타입 입력

        System.out.println(f(x));

    }

    private static long f(double x) {
        long t = (long) x;
        if (t > x) {
            return (long) x - 1;
        } else {
            return (long) x;
        }
    }
}

