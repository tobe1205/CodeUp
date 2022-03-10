package basic4_2_nestedLoop.Q1084;

import java.io.*;
import java.util.StringTokenizer;

public class Answer2 {
    public static void main(String[] args)throws IOException {

        //Scanner 보다 처리속도가 더 빠른 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer를 통해 br.readLine에 입력받은 값을 " " 기준으로 나누어 nextToken에 저장한다.
        //입력을 한번에 받기위함 ex) 2 2 2
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        //println 보다 버퍼를 이용하기 때문에 성능면에서 좋다.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        //br.readLine은 String타입이기 때문에 int형 변환을 해주어야 한다.
        int r = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        //카운트 갯수를 확인하기위한 변수
        int cnt = 0;


        for (int i = 0; i < r; i++) {
            for (int j = 0; j < g; j++) {
                for (int k = 0; k < b; k++) {
                    bw.write(i+" "+j+" "+k+"\n");
                    cnt++;
                }
            }
        }
        bw.write(String.valueOf(cnt)); //출력
        bw.flush(); //남아 있는 데이터를 모두 출력
        bw.close();
        br.close();
    }
}
