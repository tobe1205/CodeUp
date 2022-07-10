package basic6_function.Q1548;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        grade(num);
    }

    static void grade(int num) {
        if (100 >= num && 90 <= num) {
            System.out.print("A");
        } else if (90 >= num && 80 <= num) {
            System.out.print("B");
        } else if (80 >= num && 70 <= num) {
            System.out.print("C");
        } else if (70 >= num && 60 <= num) {
            System.out.print("D");
        } else {
            System.out.print("F");
        }
    }
}