package basic6_function.Q1551;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int n, k;
    static int[] arr = new int[100010];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        k = Integer.parseInt(br.readLine());

        f(k);
        br.close();
    }

    static void f(int k) {
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != k) {
                continue;
            } else {
                cnt += 1;
                System.out.println(i + 1);
                break;
            }
        }
            if(cnt == 0){
                System.out.println(-1);
            }
    }
}
