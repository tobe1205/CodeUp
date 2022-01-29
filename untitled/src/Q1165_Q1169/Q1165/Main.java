package Q1165_Q1169.Q1165;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        for (int i = x; i < 90; i+=5) {
            y++;
        }
        System.out.println(y);
    }
}
