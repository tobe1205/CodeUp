package basic4_1_whileFor.Q1675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String n = br.readLine();

        for (int i=0; i<n.length(); i++) {
            if (n.charAt(i)==32) {
                sb.append(' ');
            } else if (n.charAt(i)<100) {
                sb.append((char)(122-(99-n.charAt(i))));
            } else {
                sb.append((char)(n.charAt(i)-3));
            }

        }

        System.out.println(sb);
    }

}
