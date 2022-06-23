package basic5_2_string.Q1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        if(s.equals("love")){
            System.out.print("I love you.");
        }
        br.close();
    }
}
