package Q1170_Q1173.Q1170;

import java.io.*;
import java.util.StringTokenizer;

public class Answer2 {
    public static void main(String[] args) throws IOException {
        //BufferdReader입력 받고, st에
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        //순서대로 입력 될 학년, 반을 바로 더해준다. append기능 이용
        sb.append(st.nextToken()).append(st.nextToken());
        String number = st.nextToken();
        if (number.length() >=2) sb.append(number); //번호가 두자리면 그대로 더하기
        else sb.append("0" + number); //아니면 0을 더하고 더하기

        System.out.print(sb);

    }
}
