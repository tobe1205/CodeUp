package basic5_1_one_dimensional_array.Q1430;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N]; //숫자의 갯수

        StringTokenizer st = new StringTokenizer(br.readLine(), " "); //숫자 입력

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine()); //질문의 수

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " "); //질문 수만큼 숫자 입력

        int[] question = new int[M];

        for (int i = 0; i < question.length; i++) {
            question[i] = Integer.parseInt(st2.nextToken());
        }

//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(question));

        int[] answer = new int[M];

        for (int i = 0; i < question.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(question[i] == arr[j]){
                    answer[i] = 1;
                }
            }
        }
        for (int j : answer) {
           bw.write(j+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
