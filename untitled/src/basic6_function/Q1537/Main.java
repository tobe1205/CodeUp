package basic6_function.Q1537;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        f(n);
    }

    static void f(int n) {
        if (n == 1) {
            System.out.println("hello");
        } else {
            System.out.println("world");
        }
    }
}
