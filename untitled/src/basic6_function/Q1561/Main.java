package basic6_function.Q1561;

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

//        f(n,m);
        System.out.print(max(n,m));
//        System.out.println(n > m ? n : m);
    }

    private static int max(int n, int m) {
        return Math.max(n,m);
    }

//    private static void max(int n,int m) {
//        System.out.print(Math.max(n, m));
//    }
}
