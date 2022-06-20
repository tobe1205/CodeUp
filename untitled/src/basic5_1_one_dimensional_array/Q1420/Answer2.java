package basic5_1_one_dimensional_array.Q1420;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Answer2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        StringTokenizer st;

        Map<Integer, String> Students = new HashMap<Integer, String>();	// 이름과 키를 저장할 map
        int[] scores = new int[number];	// 키 저장할 배열

        for (int i=0; i<number; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();	// 이름
            int score = Integer.parseInt(st.nextToken());	// 키

            Students.put(score, name);	// 이름과 키 amp에 저장
            scores[i] = score;	// 키 배열에 저장
        }

        // 배열 오름차순 정렬
        Arrays.sort(scores);

        // 3번째로 큰 키를 key로 꺼낸다
        System.out.println(Students.get(scores[number-3]));
        br.close();
    }
}
