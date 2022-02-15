package basic4_1_whileFor.Q1259;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //범위 값

        int sum = 0;

        for (int i = 1; i <=n; i++) {
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.print(sum);

    }
}
