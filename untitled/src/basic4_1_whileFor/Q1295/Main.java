package basic4_1_whileFor.Q1295;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 97) { //문자가 97이상 즉 소문자일경우
                System.out.print((char) (90 - (122 - s.charAt(i))));
            } else if (s.charAt(i) >= 65) { //문자가 65이상 97미만 즉 대문자일경우
                System.out.print((char) (122 - (90 - s.charAt(i))));
            } else { //그 외 나머지
                System.out.print(s.charAt(i));
            }
        }
    }
}
