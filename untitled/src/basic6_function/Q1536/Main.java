package basic6_function.Q1536;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[] d = new int[110];

    static int f() {
        int min = d[0]; //최소값 비교를 위해 배열의 첫번째 위치의 값으로 초기화

        for (int i = 0; i < n; i++) {
            if (d[i] < min) { // min의 값보다 작을 경우
                min = d[i]; // 해당 인덱스의 값을 min에 저장
            }
        }
        return min;
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
