package basic6_function.Q1560;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long n = Long.parseLong(st.nextToken()); //long 타입으로 변환
        long m = Long.parseLong(st.nextToken());

        System.out.print(f(n,m));
    }

    private static long f(long n, long m) {

        return Math.abs(n-m); //Math.abs() 절대값으로 반환
    }
}
