package basic6_function.Q1537;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer2 {

    static void f(int n) {
        if (n == 1) {
            System.out.print("hello");
        } else {
            System.out.print("world");
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        f(n);
        br.close();
    }
}
