package basic5_2_string.Q1131;

import java.io.*;

public class Answer3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        bw.write(s);
        bw.flush();
        bw.close();
        br.close();
    }
}
