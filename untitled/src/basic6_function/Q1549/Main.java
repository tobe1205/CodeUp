package basic6_function.Q1549;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

//        abs(n);
        System.out.println(abs(n));
    }

    /*  static void abs(long n) {
          System.out.print((n *(-1)));
      }*/
    static long abs(long n) {
        long result = Math.abs(n);
        return result;

    }
}
