package Q1210;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;

        switch (a) {
            case 1 : sum += 400; break;
            case 2 : sum += 340; break;
            case 3 : sum += 170; break;
            case 4 : sum += 100; break;
            case 5 : sum += 70; break;
        }
        switch (b) {
            case 1 : sum += 400; break;
            case 2 : sum += 340; break;
            case 3 : sum += 170; break;
            case 4 : sum += 100; break;
            case 5 : sum += 70; break;
        }
        if(sum > 500) System.out.print("angry");
        else System.out.print("no angry");
    }
}
