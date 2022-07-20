package basic6_function.Q1559;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.print(f(n, m));

    }

    private static long f(int n, int m) { //int형타입 n,m을 매개변수로
        return (long) n + m; //형변환하지 않으면 에러발생 long타입으로 리턴
    }
}
