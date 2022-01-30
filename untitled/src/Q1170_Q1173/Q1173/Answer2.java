package Q1170_Q1173.Q1173;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Answer2 {
    public static void main(String[] args) throws IOException {

        //BufferedReader 이용
        //StringTokenizer에 띄어쓰기를 기준으로 nextToken에 단어 저장
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        //형변환
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        if (hour != 0) { // 1~23 인경우
            if (minute >= 30) {
                sb.append(hour + " ").append(minute - 30);
            } else
                sb.append(hour - 1 + " ").append(minute + 30);
        } else { // 00시 자정인 경우
            if (minute >= 30) {
                sb.append(hour + " ").append(minute - 30);
            } else {
                sb.append(23 + " ").append(minute + 30);
            }
        }
        System.out.print(sb);
    }
}
