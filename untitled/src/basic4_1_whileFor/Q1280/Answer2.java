package basic4_1_whileFor.Q1280;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Answer2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int num = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                num -= i;
                System.out.print("-" + i);

            } else {
                num += i;
                System.out.print("+" + i);
            }
        }
        System.out.print("=" + num);
    }
}

