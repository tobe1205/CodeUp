package Q1078;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer2 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if(i % 2 ==0){
                sum += i;
            }
        }
        System.out.print(sum);
        br.close();
    }
}
