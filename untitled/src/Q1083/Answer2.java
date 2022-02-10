package Q1083;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0){
                System.out.print("X"+" ");
            }else{
                System.out.print(i+" ");
            }
        }
        br.close();
    }
}
