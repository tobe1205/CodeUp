package basic4_2_nestedLoop.Q1677;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Answer2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int width = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if ((i == 1 || i == height) && (j == 1 || j == width)) {
                    sb.append('+');
                } else if (i == 1 || i == height) {
                    sb.append('-');
                } else if (j == 1 || j == width) {
                    sb.append('|');
                } else {
                    sb.append(' ');
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}