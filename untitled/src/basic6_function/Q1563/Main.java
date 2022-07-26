package basic6_function.Q1563;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //int형 정수 3개
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        mid(n,m,x);
    }

    private static void mid(int n, int m, int x) {
        //배열안에 각각 집어넣기
        int[] arr = new int[3];

        arr[0] = n;
        arr[1] = m;
        arr[2] = x;
        //Arrays.sort()메서드로 오름차순 정렬
        Arrays.sort(arr);
        //두번째로 큰 수 즉 1번인덱스에 위치한 값 출력
        System.out.println(arr[1]);
    }
}
