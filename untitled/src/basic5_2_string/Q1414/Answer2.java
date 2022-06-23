package basic5_2_string.Q1414;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Answer2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().toLowerCase(); //입력한 문자열을 소문자로 변환
        /*
        toLowerCase()메서드로 인해 문자열이 전부 소문자로 바뀌어서
        대문자를 확인할 필요가없다.

        대문자로 바꾸는 메서드는 toUpperCase() 이다.
         */

        int cnt = 0; //문자열에 'c'의 갯수
        int cnt2 = 0; //문자열에 'cc'가 있는 경우의 갯수

        for (int i = 0; i < s.length(); i++) { //문자열의 길이만큼 for문반복
            if (s.charAt(i) == 'c') { //문자열 s를 char타입으로 하나씩 쪼개서 'c'인지 비교
                cnt++; //'c'라면 1씩 증가
            }
            /*
            i가 문자열의 길이 -1까지해야하는 이유 :
            i가 마지막일때 다음값을 비교할 i+1이 없다.
            길이값보다 초과됨으로 에러 발생

            charAt(i)의 값이 'c'일때, i+1의 값도 'c'라면 cnt2의 값을
            1씩 증가시킨다.
             */
            if (i != s.length() - 1) {
                if (s.charAt(i) == 'c' && s.charAt(i + 1) == 'c') {
                    cnt2++;
                }
            }
        }
        //cnt, cnt2 출력
        System.out.println(cnt);
        System.out.print(cnt2);
    }
}
