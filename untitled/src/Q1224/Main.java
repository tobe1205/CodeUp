package Q1224;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        double first = a / (double)b;
        double second = c / (double)d;

        if (first > second) System.out.print(">");
        else if (first == second) System.out.print("=");
        else System.out.print("<");
    }
}
