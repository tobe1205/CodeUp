package basic4_2_nestedLoop.Q1368;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Answer2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        int h = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String d = st.nextToken();

        if (d.equals("L")) { //문자비교는 str.equals()을 이용 - 방향 d가 L이라면
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < i; j++) {
                    sb.append(" ");
                }
                for (int j = 0; j < k; j++) {
                    sb.append("*");
                }
                sb.append("\n");
            }
        } else if (d.equals("R")) { // 방향 d가 R이라면
            for (int i = h; i > 0; i--) {
                for (int j = i-1; j > 0; j--) {
                    sb.append(" ");
                }
                for (int j = 0; j < k; j++) {
                    sb.append("*");
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
        br.close();
    }
}
