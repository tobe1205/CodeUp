package Q1228;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Answer2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double height = Double.parseDouble(st.nextToken());
        double weight = Double.parseDouble(st.nextToken());

        // 표준 몸무게
        double stanWeight = (height-100) * 0.9;
        // 비만도
        double bmi = (weight-stanWeight) * 100 / stanWeight;

        if (bmi<=10) {
            System.out.print("정상");
        } else if(bmi<=20) {
            System.out.print("과체중");
        } else {
            System.out.print("비만");
        }
        br.close();
    }
}