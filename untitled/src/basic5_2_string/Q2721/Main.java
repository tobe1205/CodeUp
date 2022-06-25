package basic5_2_string.Q2721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();

        if (s1.charAt(s1.length() - 1) == s2.charAt(0)) {
            if (s2.charAt(s2.length() - 1) == s3.charAt(0)) {
                if (s3.charAt(s3.length() - 1) == s1.charAt(0)) {
                    System.out.print("good");
                } else {
                    System.out.print("bad");
                }
            } else {
                System.out.print("bad");
            }
        } else {
            System.out.print("bad");
        }
        br.close();
    }
}
