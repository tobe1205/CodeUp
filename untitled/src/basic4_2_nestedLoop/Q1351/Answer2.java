package basic4_2_nestedLoop.Q1351;

import java.io.*;
import java.util.StringTokenizer;

public class Answer2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[2];
        arr = br.readLine().split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        for (int i = a; i <= b; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d*%d=%d\n",i,j,(i*j));
            }
        }
        br.close();
    }
}
