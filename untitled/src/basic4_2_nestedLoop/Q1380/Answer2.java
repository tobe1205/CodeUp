package basic4_2_nestedLoop.Q1380;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if(i+j==k){
                    System.out.println(i+" "+j);
                }
            }
        }
        br.close();
    }
}
