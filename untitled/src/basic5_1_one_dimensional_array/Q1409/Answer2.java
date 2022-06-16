package basic5_1_one_dimensional_array.Q1409;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Answer2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int k = Integer.parseInt(br.readLine());

        String[] arr = new String[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = st.nextToken();
        }

        System.out.print(Integer.parseInt(arr[k-1]));
        br.close();
    }
}
