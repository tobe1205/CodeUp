package basic6_function.Q1558;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine(); //String 타입으로 입력을 받아 변수에 저장

        f(n); //메서드 실행
        br.close();
    }

    private static void f(String n) {
        /*
        문자열의 길이만큼 for문 수행
        charAt() 메서드로 입력받은 n을 각각 char타입으로 나누어 하나씩 출력한다.
        ex) "12345" -> '5'부터 하나씩 순차적으로 출력
         */
        for (int i = n.length()-1; i >= 0; i--) {
            System.out.print(n.charAt(i));
        }
    }
}
