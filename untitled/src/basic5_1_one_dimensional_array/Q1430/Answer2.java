package basic5_1_one_dimensional_array.Q1430;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Answer2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());//숫자의 갯수
        int[] arr = new int[10000001];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            arr[tmp] = 1;
        }

        int M = Integer.parseInt(br.readLine());

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            int tmp = Integer.parseInt(st2.nextToken());
            if (arr[tmp] == 1) {
                bw.write("1" + " ");
            } else {
                bw.write("0" + " ");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}