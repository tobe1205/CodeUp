package basic4_1_whileFor.Q1277;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];

        arr = br.readLine().split(" ");

        System.out.print(arr[0]+" "+ (arr[n/2])+" "+(arr[n-1]));
        br.close();
    }
}
