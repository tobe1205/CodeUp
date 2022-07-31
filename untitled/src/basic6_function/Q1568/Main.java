package basic6_function.Q1568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int n, a, b;
    static int[] arr = new int[1010];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine()); //데이터의 갯수 n개 입력

        StringTokenizer st = new StringTokenizer(br.readLine(), " "); //공백을 두고 n개의 데이터 입력

        for (int i = 1; i <= n; i++) { //배열안에 Token으로 변환된 값을 각각 저장
            arr[i] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " "); //공백을 두고 a, b 입력

        a = Integer.parseInt(st2.nextToken()); //시작번호
        b = Integer.parseInt(st2.nextToken()); //마지막번호

        System.out.println(maxi(a, b)); //메서드 실행
    }

    private static long maxi(int a, int b) {
        int max = arr[a]; //비교하기위한 최초값 설정
        for (int i = a; i <= b; i++) { //a ~b까지의 범위 중
            if(max < arr[i]) { //max값보다 크다면
                max = arr[i]; //max값 변경
            }
        }
        //다시 for문 수행
        for (int i = a; i <= b; i++) {
            if(arr[i] == max){ //위에서 찾은 최대값과 같은 숫자가 있다면
                return i; //해당 위치 리턴
            }
        }
        return 0;
    }
}
