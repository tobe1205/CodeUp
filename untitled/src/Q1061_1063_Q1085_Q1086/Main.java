package Q1061_1063_Q1085_Q1086;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*//1061번문제
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x|y);*/
        //================================

        //1062번문제
        /*Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x^y);*/
        //================================

        /*//1063번문제
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int min = (x>y? y>z? z:y : x>z? z:x);

        System.out.println(min);*/

        //================================

        //1085번문제
        /*Scanner sc = new Scanner(System.in);

        long h = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long s = sc.nextInt();
        double div2 = 8*(2<<9)*(2<<9);
        System.out.printf("%.1f MB", (h*b*c*s)/ div2);*/

        //================================

        //1086번문제
        Scanner sc = new Scanner(System.in);

        long w = sc.nextInt();
        long h = sc.nextInt();
        long b = sc.nextInt();
        double div2 = 8*(2<<9)*(2<<9);
        System.out.printf("%.2f MB", (w*h*b)/ div2);

        //================================

    }
}
