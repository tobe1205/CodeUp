package basic5_2_string.Q1990;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n = sc.next(); //자연수 n 범위로 인해 String으로 입력받음

        int sum = 0;

        for (int i = 0; i < n.length(); i++) {
            String num = String.valueOf(n.charAt(i));
            sum += Integer.parseInt(num);
        }
        if (sum % 3 == 0) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }
        sc.close();
    }
}
