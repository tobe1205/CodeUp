package basic5_1_one_dimensional_array.Q1402;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Answer2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[n];

        for (int i = arr.length-1; i >= 0; i--) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i : arr) {
            System.out.print(i+ " ");
        }
        br.close();
    }
}
