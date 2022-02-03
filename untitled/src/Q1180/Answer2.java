package Q1180;

import java.io.*;
import java.util.StringTokenizer;

public class Answer2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split("");

        int n1 = Integer.parseInt(arr[0]);
        int n2 = Integer.parseInt(arr[1]);
        int sum = Integer.parseInt(arr[1]+ arr[0]);
        int result = sum * 2;

        String resultStr = null;

        if(result >= 100){
            result = result - 100;
        }

        if (result<=50) resultStr = "GOOD";
        else resultStr = "OH MY GOD";


        bw.write(result+"\n");
        bw.write(resultStr);

        bw.flush();
        bw.close();
        br.close();
    }
}
