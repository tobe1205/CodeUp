package basic4_2_nestedLoop.Q1354;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}