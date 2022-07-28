package basic6_function.Q1565;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static long a, b;

    /*    static long lcm(long a, long b) {
            for (long i = a + b; i >= 0; i--) {
                if (a % i == 0) {
                    if (b % i == 0) return i;
                }
            }
            return 0;
        }*/
    static long gcd(long p, long q) {
        if (p == 0) return q;
        return gcd(q % p, p);
    }
    static long lcm(long a, long b){
        return a*b / gcd(a, b);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        System.out.println(lcm(a, b));
    }
}

