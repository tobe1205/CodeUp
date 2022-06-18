package basic5_1_one_dimensional_array.Q1412;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 알파벳의 총 갯수는 26개
        int[] alphabet = new int[26];

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine(); //문자열을 입력받을 변수

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); //문자열을 charAt()을 이용하여 char타입으로 쪼개서 변수에 저장
            if (ch >= 97 && ch <= 122) { //소문자일때만 alphabet[i] 값이 증가한다.
                alphabet[ch - 97]++;
            }

            // 아스키코드에서 영어소문자는
            // 97 = 'a' 부터  ----- 122 = 'z' 까지입니다.

            // 만약에 영어대문자부터 하고 싶다면
            // 65 = 'A' 부터 ----- 90 = 'Z' 까지입니다.
        }
        for (int i = 0; i < 26; i++) {
            System.out.println((char) (97 + i) + ":" + alphabet[i]);
        }
    }
}

