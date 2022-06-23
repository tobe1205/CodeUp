package basic5_2_string.Q1418;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine(); //문자열 입력

        for (int i = 0; i < s.length(); i++) { //문자열의 길이만큼 for문 수행
            if(s.charAt(i)=='t'){ //문자열을 charAt()메서드를 사용
                // char타입으로 하나씩 나누어 't'인지 확인
                //해당위치의 값이 't'라면 해당 인덱스 출력
                System.out.print(i+1+" ");
            }
        }
        br.close();
    }
}
