package Q1210;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Answer3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //칼로리의 값을 저장할 변수 초기화
        int total = 0;

        //2개의 메뉴 입력을 위한 반복문 실행
        for (int i = 0; i < 2; i++) {
            //입력된 메뉴에 따라 계산
            switch (st.nextToken()){
                case "1": total += 400; break;
                case "2": total += 340; break;
                case "3": total += 170; break;
                case "4": total += 100; break;
                case "5": total += 70; break;
            }
        }
        //삼항 연산자를 이용 출력
        System.out.print(total>500? "angry": "no angry");
        br.close();
    }
}
