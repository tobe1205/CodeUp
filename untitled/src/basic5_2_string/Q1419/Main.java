package basic5_2_string.Q1419;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if(i != s.length()-1){
                if(s.charAt(i)=='l'){
                    if(s.charAt(i+1)=='o'){
                        if(s.charAt(i+2)=='v'){
                            if(s.charAt(i+3)=='e'){
                                cnt++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
