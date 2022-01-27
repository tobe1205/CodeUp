package Q1151_Q1160.Q1158;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        //삼항연산자 사용
        System.out.println(((x>=30&& x<=40)||(x>=60 && x<=70))? "win": "lose");
    }
}
