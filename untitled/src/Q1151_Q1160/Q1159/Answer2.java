package Q1151_Q1160.Q1159;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        System.out.println(((x>=50 && x<=70)||(x%6 ==0)? "win": "lose"));
    }
}
