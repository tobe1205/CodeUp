package basic5_1_one_dimensional_array.Q1094;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        String[] num = br.readLine().split(" ");

        for (int i = 0; i < num.length; i++) {
            arr[i] = Integer.parseInt(num[num.length-i-1]);
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        br.close();
    }
}
