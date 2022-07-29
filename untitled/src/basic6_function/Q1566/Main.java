package basic6_function.Q1566;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static long a, n;

    static void pow(long a, long n) {
        long result = a;

        for (int i = 1; i < n; i++) {
            a *= result;
        }
        if (n == 0) System.out.println(1);
        else {
            System.out.println(a);
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        a = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        pow(a, n);
    }
}
