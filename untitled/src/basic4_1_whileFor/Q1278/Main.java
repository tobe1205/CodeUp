package basic4_1_whileFor.Q1278;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            cnt++;
        }
        System.out.print(cnt);
    }
}
