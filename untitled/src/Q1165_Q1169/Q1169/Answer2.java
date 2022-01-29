package Q1165_Q1169.Q1169;

import java.io.*;

public class Answer2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int age = Integer.parseInt(br.readLine());

        int year = 2012 - age +1 ;

        if(year < 2000) bw.write(year - 1900 + " 1" );
        else bw.write(year - 2000 + " 3");
        bw.flush();
        bw.close();
        br.close();
    }
}
