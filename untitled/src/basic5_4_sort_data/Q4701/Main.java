package basic5_4_sort_data.Q4701;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int plus = 1000000000;
        int minus = -1000000000;
        int plusN1 = 0;
        int plusN2 = 0;
        int minus1 = 0;
        int minus2 = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int tmp = arr[i] + arr[j];
                if (tmp > 0 && tmp < plus) {
                    plus = tmp;
                    plusN1 = arr[i];
                    plusN2 = arr[j];
                } else if (tmp < 0 && tmp > minus) {
                    minus = tmp;
                    minus1 = arr[i];
                    minus2 = arr[j];
                } else if (tmp == 0) {
                    System.out.printf("%d %d", arr[i], arr[j]);
                    i = n;
                    break;
                }
            }
        }
        if (plus * -1 > minus && minus < 0)
            System.out.printf("%d %d", plusN1, plusN2);
        else if (minus * -1 < plus && plus > 0)
            System.out.printf("%d %d", minus1, minus2);
    }
}