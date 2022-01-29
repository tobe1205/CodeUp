package Q1165_Q1169.Q1168;

import java.io.*;
import java.util.StringTokenizer;

public class Answer2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        //주민등록번호
        int frontNo = Integer.parseInt(st.nextToken());
        int backNo= Integer.parseInt(st.nextToken());

        //현재 년도
        int now = 2012;
        //나이
        int age = 0;

        if (backNo == 1 || backNo == 2) { // 1 ,2 면 1900년생
            frontNo = frontNo /10000 + 1900; // 몫에서 해당 년대를 더함
        } else {
            frontNo = frontNo / 10000 + 2000;
        }

        //나이는 현재년도 - 태어난년도 + 1
        age = now - frontNo +1 ;
        System.out.print(age);
    }
}