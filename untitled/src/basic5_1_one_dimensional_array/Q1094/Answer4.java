package basic5_1_one_dimensional_array.Q1094;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] num = br.readLine().split(" ");

        for (int i = num.length-1; i >= 0 ; i--) {
            System.out.print(Integer.parseInt(num[i])+" ");
        }
        br.close();
    }
}
