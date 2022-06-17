package basic5_1_one_dimensional_array.Q1411;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] card = new int[50];

        for (int i = 0; i < n - 1; i++) {
            card[i] = sc.nextInt();
        }

        Arrays.sort(card, 0, n - 1);
//        System.out.println(Arrays.toString(card));
        for (int i = 0; i < n; i++) {
            if (card[i] != i + 1 || card[i] == 0) {
                System.out.println(i + 1);
                break;
            }
        }
        sc.close();
    }
}
