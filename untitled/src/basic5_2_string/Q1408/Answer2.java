package basic5_2_string.Q1408;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String password = br.readLine();

        for (int i = 0; i < password.length() ; i++) {
            System.out.print((char)(password.charAt(i)+2));
        }
        System.out.println();
        for (int i = 0; i < password.length(); i++) {
            System.out.print((char)((password.charAt(i)*7 % 80 + 48)));
        }
        br.close();
    }
}
