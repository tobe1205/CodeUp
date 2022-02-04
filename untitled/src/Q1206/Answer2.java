package Q1206;

import java.io.*;
import java.util.StringTokenizer;

public class Answer2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a % b == 0) {
            bw.write(b+"*"+a/b+"="+a);
        } else if (b % a == 0){
            bw.write(a+"*"+b/a+"="+b);
        }else {
            bw.write("none");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
