package basic4_1_whileFor.Q1294;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 32) {
                System.out.print(" ");
            } else if (s.charAt(i) > 96 && s.charAt(i) < 120) {
                System.out.print((char) (s.charAt(i) + 3));
            } else {
                System.out.print((char) (99 - (122 - s.charAt(i))));
            }

        }
    }
}
