package basic6_function.Q1562;

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

//        System.out.print(min(n,m));


        min(n,m);
    }
//
//    private static int min(int n, int m) {
//        return Math.min(n,m);
//    }

    private static void min(int n, int m){
        System.out.print(Math.min(n,m));
    }
}
