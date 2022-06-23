package basic5_2_string.Q1414;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().toLowerCase();

        int cnt = 0;
        int cnt2 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'c') {
                cnt++;
            }
            if (i != s.length() - 1) {
                if (s.charAt(i) == 'c' && s.charAt(i + 1) == 'c') {
                    cnt2++;
                }
            }
        }
        System.out.println(cnt);
        System.out.print(cnt2);
    }
}
