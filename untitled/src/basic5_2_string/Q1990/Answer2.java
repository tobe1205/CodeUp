package basic5_2_string.Q1990;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();

        int sum = 0;

        for (int i = 0; i < n.length(); i++) {
            String num = String.valueOf(n.charAt(i));
            sum += Integer.parseInt(num);
        }

        if (sum % 3 == 0) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }
        br.close();
    }
}
