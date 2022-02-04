package Q1207;

import java.io.*;
import java.util.StringTokenizer;

public class Answer2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int result = a + b + c + d;

        switch (result) {
            case 1: bw.write("도"); break;
            case 2: bw.write("개"); break;
            case 3: bw.write("걸"); break;
            case 4: bw.write("윷"); break;
            default:bw.write("모"); break;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
