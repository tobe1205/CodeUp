package basic4_2_nestedLoop.Q1378;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Answer2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int sum = 0;

        //입력된 값까지 반복 수행 : num이 5라면, 총 5번 반복
        for (int i = 1; i <= num; i++) {
            //j는 0부터 i의 값까지 수행 이때 i는 1부터 시작
            for (int j = 0; j <= i; j++) {
                //sum에 j를 저장한다.
                sum += j;

                /*ex : 5입력 num = 5
                i는 1부터 num까지 총 5번 수행
                첫번째 for문 수행 시 : j는 0~1까지 sum에 더해준다.
                두번쨰 for문 수행 시 : j는 0~2까지 sum에,
                세번째 for문 수행 시 : j는 0~3까지 sum에,
                네번째 for문 수행 시 : j는 0~4까지 sum에,
                다섯번째 for문 수행 시 : j는 0~5까지 sum에 저장한다.
                */
            }
        }
        //반복이 끝나면 sum의 값을 출력
        System.out.println(sum);

        //num값이 0일 경우, 첫번째 for문이 수행되지 않고 그대로 0값이 출력된다.

    }
}
