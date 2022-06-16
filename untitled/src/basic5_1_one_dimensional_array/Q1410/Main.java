package basic5_1_one_dimensional_array.Q1410;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int num1 = 0;
        int num2 = 0;

        char s1 = '(';
        char s2 = ')';


        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s1) {
                num1++;
            } else if (s.charAt(i) == s2)
                num2++;
        }
        System.out.print(num1 + " " + num2);
    }
}
