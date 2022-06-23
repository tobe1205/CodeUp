package basic5_2_string.Q1733;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        if (s.equals("IOI")) {
            System.out.println("IOI is the International Olympiad in Informatics.");
        } else {
            System.out.println("I don't care.");
        }
        br.close();
    }
}
