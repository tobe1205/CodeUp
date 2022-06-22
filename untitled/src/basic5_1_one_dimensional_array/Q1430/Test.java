package basic5_1_one_dimensional_array.Q1430;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<Integer, Integer> nn = new HashMap<Integer, Integer>(10000000);

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i<n; i++) {
            int key = Integer.parseInt(st.nextToken()); // key = 불러주는 n값들
            nn.put(key, 1); // 받는 key값이 등록된 key값일 경우 value = 1을 내어주어라
        } // 맞는 n값이 들어오면 1을 출력할 수 있게

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i<m; i++) {
            int mm = Integer.parseInt(st2.nextToken());
            if(nn.get(mm) == null) {
                bw.write("0"+" ");
            }else{
                bw.write("1"+" ");
            }
        }
            bw.flush();
            br.close();
            bw.close();
    }
}
		