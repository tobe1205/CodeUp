package Q1080;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
            cnt++;
            if (sum >= n) {
                break;
            }
        }
        System.out.print(cnt);
        br.close();
    }
}
