package basic4_1_whileFor.Q1675;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==32){
                System.out.print(" ");
            }else if(s.charAt(i)<100){
                System.out.print((char)(122-(99-s.charAt(i))));
            } else {
                System.out.print((char)(s.charAt(i)-3));
            }

        }
    }
}
