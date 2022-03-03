package basic4_1_whileFor.Q1283;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Answer2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(br.readLine()); //투자한 액수

        int b = Integer.parseInt(br.readLine()); //투자 일수

        double c = a;

        String[] arr = new String[b];
        arr = br.readLine().split(" ");

        for (int i = 0; i < b; i++) {
            c = (c + (c * Double.parseDouble(arr[i]) / 100));
        }
        System.out.printf("%.0f\n", c - a);
        /*if (a > c) System.out.print("bad");
        else if (a == c) System.out.print("same");
        else System.out.print("good");*/

        System.out.print(a>c? "bad" : a<c? "good":"same");
        br.close();
    }
}
