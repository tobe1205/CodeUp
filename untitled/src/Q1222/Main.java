package Q1222;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();
        int team1 = sc.nextInt();
        int team2 = sc.nextInt();

        for (int i = time; i < 90; i+=5) {
            team1++;
        }
        if (team1 > team2){
            System.out.print("win");
        } else if (team1 == team2){
            System.out.print("same");
        } else {
            System.out.print("lose");
        }
    }
}
