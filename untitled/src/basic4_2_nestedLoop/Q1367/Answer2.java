package basic4_2_nestedLoop.Q1367;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine()); //n입력

        for (int i = n; i > 0; i--) { // n만큼 줄의 개수
            for (int j = i - 1; j > 0; j--) { // i-1부터 0까지 공백 출력
                sb.append(" ");
            }
            for (int j = 0; j < n; j++) { //공백 출력이 끝나고 난 후 n개 만큼 별표 출력
                sb.append("*");
            }
            sb.append("\n"); //줄에 출력이 끝나면 줄바꿈
        }
        System.out.print(sb);
        br.close();
    }
}
