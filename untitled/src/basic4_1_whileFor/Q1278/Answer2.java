package basic4_1_whileFor.Q1278;

import java.io.*;

public class Answer2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            cnt++;
        }

        System.out.print(cnt);
    }
}
