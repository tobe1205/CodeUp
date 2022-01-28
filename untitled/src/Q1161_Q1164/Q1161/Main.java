package Q1161_Q1164.Q1161;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        //Scanner기능 유사
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //println기능과 유사
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 두 문자를 담을 배열 상성
        String[] arr;

        //readLine으로 입력받고, 띄어쓰기를 기준으로 각각 나눠서 arr에 저장
        arr = br.readLine().split(" ");

        //readLine 으로 받는 값들은 문자열로 받기 때문에 정수 타입으로 변환을 해줘야 한다.
        String a = Integer.parseInt(arr[0]) % 2 == 0 ? "짝수" : "홀수";
        String b = Integer.parseInt(arr[1]) % 2 == 0 ? "짝수" : "홀수";

        String result = (Integer.parseInt(arr[0]) + Integer.parseInt(arr[1])) % 2 == 0 ? "짝수" : "홀수";

        //출력
        bw.write(a + "+" + b + "=" + result);

        bw.flush();
        bw.close();
        br.close();

    }
}
