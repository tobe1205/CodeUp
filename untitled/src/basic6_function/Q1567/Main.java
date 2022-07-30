package basic6_function.Q1567;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n, a, b;
    static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine()); //데이터의 갯수를 저장할 변수 생성

        arr = new int[n]; //n의 크기만큼의 int배열 생성

        StringTokenizer st = new StringTokenizer(br.readLine(), " "); //공백을 두고 n개의 데이터 입력

        for (int i = 0; i < n; i++) { //n만큼 반복
            arr[i] = Integer.parseInt(st.nextToken()); //Token으로 변환된 값을 arr배열에 각각 저장
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " "); //공백을 두고 시작번호,마지막번호 입력

         a = Integer.parseInt(st2.nextToken()); //시작 번호
         b = Integer.parseInt(st2.nextToken()); //마지막 번호

        subsetsum(a,b); //메서드 수행

    }

    private static void subsetsum(int a, int b) {
        long result = 0; //더한 값을 저장할 long형 변수 생성

        for (int i = a; i <= b; i++) { //시작번호부터 마지막번호까지만
            result+= arr[i-1]; // result변수에 배열안의 값을 저장한다.
            //배열은 0부터 시작하기때문에 -1을 해준다.
        }
        System.out.print(result); //결과 값 출력
    }

}
