package Q1161_Q1164.Q1164;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = new String[3];

        arr = br.readLine().split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);

        String result = a <= 170 || b<= 170 || c<= 170 ? "CRASH" : "PASS";

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();

    }
}
