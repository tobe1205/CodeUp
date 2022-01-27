package Q1151_Q1160.Q1159;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if(x>=50 && x<= 70) System.out.println("win");
        else if (x % 6 == 0) System.out.println("win");
        else System.out.println("lose");
    }
}
