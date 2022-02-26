package basic4_1_whileFor.Q1272;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int h = sc.nextInt();

        int sum = 0;

        if (k % 2 == 0) {
            sum += (k * 10) / 2;
        } else {
            sum += (k + 1) / 2;
        }

        if(h % 2 == 0){
            sum+= (h *10) / 2;
        } else {
            sum += (h + 1) / 2;
        }

        System.out.print(sum);
    }
}
