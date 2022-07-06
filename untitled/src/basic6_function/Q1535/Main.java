package basic6_function.Q1535;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import java.util.StringTokenizer;

public class Main {

    static int n; //전역변수 설정
    static int[] d = new int[101]; //전역변수

    static int f() {
        int max = 0;
        int result = 0;

        for (int i = 0; i < n; i++) {
            if (d[i] > max) {
                max = d[i]; //제일 큰값 찾기
            }
        }
        for (int i = 0; i < n; i++) {
            if (d[i] == max) {
                result = i + 1;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            d[i] = Integer.parseInt(st.nextToken());
        }
        System.out.print(f());
        br.close();
    }
}
