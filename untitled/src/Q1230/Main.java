package Q1230;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > 170) {
            if (b > 170){
                if (c > 170) {
                    System.out.print("PASS");
                } else {
                    System.out.print("CRASH " + c);
                }
            } else {
                System.out.print("CRASH "+ b);
            }
        } else {
            System.out.print("CRASH "+ a);
        }
    }
}
