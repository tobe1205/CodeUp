package basic4_1_whileFor.Q1254;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");

        char a = arr[0].charAt(0);
        char b = arr[1].charAt(0);

        char tmp;

        if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }

        for (int i = a; i <= b; i++) {
            System.out.printf("%c ", i);

        }

    }
}
