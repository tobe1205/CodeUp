package basic4_1_whileFor.Q1274;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 0;

        for (int i = 1; i <=n; i++) {
            if(n % i == 0){
                num++;
            }
        }
        if(num == 2){
            System.out.print("prime");
        } else{
            System.out.print("not prime");
        }
    }
}
