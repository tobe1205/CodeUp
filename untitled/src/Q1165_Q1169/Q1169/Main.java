package Q1165_Q1169.Q1169;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int year = 2012 - age + 1;

        if ( year < 2000) System.out.print(year - 1900 + " 1");
        else System.out.print(year - 2000 + " 3");
    }
}


