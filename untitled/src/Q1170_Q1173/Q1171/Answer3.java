package Q1170_Q1173.Q1171;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Answer3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        // 순서대로 입력 될 학년은 바로 더해준다.
        sb.append(st.nextToken());
        String classes = st.nextToken();
        String number = st.nextToken();

        if (classes.length()<2) {	// 자리수가 2자리보다 낮으면 앞에 0 붙이기
            sb.append("0" + classes);
        } else {	// 자리수가 2자리이면 그대로 저장
            sb.append(classes);
        }

        if (number.length()<3) {	// 번호의 자리수가 3보다 낮으면
            for (int i=0; i<3-number.length(); i++) {	//낮은만큼 for문 돌리기
                sb.append("0");
            }
        }
        sb.append(number);
        System.out.print(sb);
    }
}