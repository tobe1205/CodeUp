package Q1170_Q1173.Q1171;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Answer2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        sb.append(st.nextToken());

        String number2 = st.nextToken();
        if(number2.length()>=2) sb.append(number2);
        else sb.append("0"+number2);

        String number3 = st.nextToken();
        if(number3.length()== 1) sb.append("0" +"0" + number3);
        else if (number3.length() == 2) sb.append("0"+number3);
        else sb.append(number3);

        System.out.print(sb);


    }
}
