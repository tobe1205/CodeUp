package Q1151_Q1160.Q1154;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println((x>y)? x-y: y-x);
    }
}
