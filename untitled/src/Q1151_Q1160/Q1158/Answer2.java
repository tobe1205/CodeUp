package Q1151_Q1160.Q1158;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if(x>=30 && x<=40) System.out.println("win");
        else if (x>=60 && x<=70) System.out.println("win");
        else System.out.println("lose");
    }
}
