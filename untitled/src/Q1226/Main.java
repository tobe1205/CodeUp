package Q1226;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] lottoNo = new int[7];
        int[] choiceNo = new int[6];

        for (int i = 0; i < 6; i++) {
            lottoNo[i] = sc.nextInt();
        }
        lottoNo[6] = sc.nextInt();

        for (int i = 0; i < 6; i++) {
            choiceNo[i] = sc.nextInt();
        }
        int count = 0;
        int bonus = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lottoNo[i] == choiceNo[j]) {
                    count++;
                }
                if (lottoNo[6] == choiceNo[j]) {
                    bonus++;
                }
            }
        }
        System.out.println(Arrays.toString(lottoNo));
        System.out.println(Arrays.toString(choiceNo));
        if (bonus == 0) {
            if (count <= 2) System.out.print(0);
            else if (count == 3) System.out.print(5);
            else if (count == 4) System.out.print(4);
            else if (count == 5) System.out.print(3);
            else if (count == 6) System.out.print(1);

        } else {
            if (count <= 2) System.out.print(0);
            else if (count == 3) System.out.print(5);
            else if (count == 4) System.out.print(4);
            else if (count == 5) System.out.print(2);
            else if (count == 6) System.out.print(1);
        }
    }
}
