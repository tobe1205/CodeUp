package Q1230;

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
        int c = Integer.parseInt(st.nextToken());

        // a, b, c 순서대로 통과 => 순서대로 조건문 작성
        if (a<=170) {
            System.out.print("CRASH " + a);
        } else if (b<=170) {
            System.out.print("CRASH " + b);
        } else if (c<=170) {
            System.out.print("CRASH " + c);
        } else {
            //모두 통과하면 pass
            System.out.print("PASS");
        }
        br.close();
    }
}