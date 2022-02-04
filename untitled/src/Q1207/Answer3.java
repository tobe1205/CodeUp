package Q1207;

import java.io.*;
import java.util.StringTokenizer;


public class Answer3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 4개의 윷 상태를 입력 받는다.
        String a = st.nextToken();
        String b = st.nextToken();
        String c = st.nextToken();
        String d = st.nextToken();

        int result = 0;
        // 몇개가 뒤집어져 있는지 확인
        if (a.equals("0")) result+=1;
        if (b.equals("0")) result+=1;
        if (c.equals("0")) result+=1;
        if (d.equals("0")) result+=1;

        // 뒤집어져있는 개수에 따라 결과 저장
        switch (result) {
            case 0 : bw.append("윷"); break;
            case 1 : bw.append("걸"); break;
            case 2 : bw.append("개"); break;
            case 3 : bw.append("도"); break;
            default: bw.append("모"); break;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}