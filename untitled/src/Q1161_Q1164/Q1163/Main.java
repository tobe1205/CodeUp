package Q1161_Q1164.Q1163;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = new String[3];

        arr = br.readLine().split(" ");

        int y = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        int d = Integer.parseInt(arr[2]);

        String result = (y+m+d)/100%10%2 ==0 ? "대박":"그럭저럭";

        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
}
