package Q1214;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int m = sc.nextInt();

        if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0) && m == 2) {
            System.out.print(29);
        } else {
            switch (m) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.print(31);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println(30);
                    break;
                case 2:
                    System.out.print(28);
            }
        }

    }
}
