package Q1165_Q1169.Q1166;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0) System.out.println("yes");
        else if (year % 400 == 0) System.out.println("yes");
        else System.out.println("no");

    }
}
