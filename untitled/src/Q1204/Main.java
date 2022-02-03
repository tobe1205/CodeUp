package Q1204;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n % 10 ==  1 || n % 10 == 2 || n % 10 == 3){
            if(n == 11) System.out.println("11th");
            else if(n == 12) System.out.println("12th");
            else if(n == 13) System.out.println("13th");
            else if(n % 10 == 1) System.out.println(n + "st");
            else if(n % 10 == 2) System.out.println(n + "nd");
            else if(n % 10 == 3) System.out.println(n + "rd");
        } else
            System.out.println(n + "th");

    }
}
