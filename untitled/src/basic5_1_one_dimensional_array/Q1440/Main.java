package basic5_1_one_dimensional_array.Q1440;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + ": ");
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j] && i != j) {
                    System.out.print("> ");
                } else if (arr[i] < arr[j]) {
                    System.out.print("< ");
                } else if (arr[i] == arr[j] && i != j) {
                    System.out.print("= ");
                }
            }
            System.out.println();
        }
    }
}

