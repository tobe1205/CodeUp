package basic5_1_one_dimensional_array.Q1093;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int call[] = new int[23];

        int n = Integer.parseInt(br.readLine());

        String arr[] = br.readLine().split(" ");

        for (int i = 0; i < arr.length; i++) {
            call[Integer.parseInt(arr[i])-1]++;
        }
        for (int i = 0; i < call.length; i++) {
            System.out.print(call[i]+" ");
        }
        br.close();
    }
}
