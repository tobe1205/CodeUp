package basic5_1_one_dimensional_array.Q1410;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int left=0;
        int right=0;

        for (int i=0; i<line.length(); i++) {
            if (line.charAt(i)==40) {
                left+=1;
            } else {
                right+=1;
            }
        }
        System.out.println(left + " " + right);
    }

}