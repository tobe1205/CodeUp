package Q1201;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(n > 0 ? "양수": n < 0 ? "음수" : "0");
    }
}
