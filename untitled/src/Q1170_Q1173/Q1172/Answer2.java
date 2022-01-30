package Q1170_Q1173.Q1172;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Answer2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        // 3수를 배열에 저장
        int[] number = new int[3];
        for (int i=0; i<3; i++) {
            // 배열에 인덱스 증가에 따라 저장
            number[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 정렬
        Arrays.sort(number);

        // 향상 for문
        for (int i : number) {
            sb.append(String.valueOf(i)+" ");
        }
        System.out.print(sb);
    }
}