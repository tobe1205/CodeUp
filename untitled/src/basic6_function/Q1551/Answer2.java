package basic6_function.Q1551;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Answer2 {

    static int n, k; //인스턴스메서드에서도 사용하기 위해, 전역변수 n, k 생성
    static int[] arr = new int[100010]; //전역변수로 배열의 크기 생성

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine()); //n 값을 입력받는다.

        StringTokenizer st = new StringTokenizer(br.readLine(), " "); //n개의 값을 입력받는다.

        for (int i = 0; i < n; i++) {
            //배열안에 토큰으로 생성된 값을 각각 저장한다.
            arr[i] = Integer.parseInt(st.nextToken());
        }

        k = Integer.parseInt(br.readLine()); //k값 입력

        System.out.println(f(k)); // 리턴받은 값 출력
    }

    static int f(int k) {
        //반복문 실행
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k){ //k가 있다면
                return i+1; //해당 위치값(인덱스) 출력
            }
        } //k가 없다면
        return -1; //-1출력
    }
}
