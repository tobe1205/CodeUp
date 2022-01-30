package Q1170_Q1173.Q1173;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if(hour != 0) {
            if (minute >= 30) {
                System.out.printf("%d %d", hour, minute - 30);
            } else {
                hour -= 1;
                System.out.printf("%d %d", hour, (minute + 30));
            }
        } else {
            if (minute >= 30){
                System.out.printf("%d %d",hour,minute -30);
            }else {
                hour = 23;
                System.out.printf("%d %d",hour,minute+30);
            }
        }
    }
}
