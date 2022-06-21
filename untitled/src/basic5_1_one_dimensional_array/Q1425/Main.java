package basic5_1_one_dimensional_array.Q1425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); //학생 수
        int C = Integer.parseInt(st.nextToken()); //한줄에 앉을 수 있는 수

        int[] arr = new int[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(arr); // 오름차순 정렬

        for (int i = 1; i <= arr.length; i++) {
            System.out.print(arr[i-1] + " ");
            if (i % C == 0)
                System.out.println();
        }
    }
}
