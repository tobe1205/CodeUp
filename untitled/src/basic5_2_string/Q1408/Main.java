package basic5_2_string.Q1408;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String password = sc.next(); //패스워드 입력

        for (int i = 0; i < password.length() ; i++) {
            System.out.print((char)(password.charAt(i)+2));
        }
        System.out.println();
        for (int i = 0; i < password.length(); i++) {
            System.out.print((char)((password.charAt(i)*7 % 80 + 48)));
        }
        sc.close();
    }
}
