package basic5_1_one_dimensional_array.Q1440;

import java.io.*;
import java.util.StringTokenizer;

public class Answer2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n; i++) {
            bw.write(i+1 +": ");
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j] && i != j) {
                    bw.write("> ");
                } else if (arr[i] < arr[j]) {
                    bw.write("< ");
                } else if (arr[i] == arr[j] && i != j) {
                    bw.write("= ");
                }
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
