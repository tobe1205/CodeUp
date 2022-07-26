package basic6_function.Q1563;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Answer2 {

    static int n, m, x;

    static int mid(int n, int m, int x) {
        if (n >= m && n <= x || n <= m && n >= x) return n;
        else if (m >= n && m <= x || m <= n && m >= x) return m;
        else if (x >= n && x <= m || x <= n && x >= m) return x;

        return 0;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        System.out.println(mid(n, m, x));
    }
}
