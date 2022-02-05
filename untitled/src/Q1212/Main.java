package Q1212;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean yesNo = false;

        if (a > b) {
            if (a > c) {
                if (a < b + c) {
                    yesNo = true;
                }
            } else {
                if (c < a + b) {
                    yesNo = true;
                }
            }
        } else {
            if (b > c) {
                if (b < a + c) {
                    yesNo = true;
                }
            } else {
                if (c < a + b) {
                    yesNo = true;
                }
            }
        }
        System.out.print(yesNo? "yes": "no");
    }
}
