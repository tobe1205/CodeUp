package Q1214;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Answer2{
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int year = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());

            // 만약 월이 2월이면
            if (month==2) {
                // 그 해가 윤년이라면
                if ( (year%400==0) || (year%4==0 && year%100!=0) ) {
                    sb.append("29");	// 29일이다.
                } else {
                    sb.append("28");
                }
            } else {
                switch(month) {
                    case 1 : sb.append("31"); break;
                    case 3 : sb.append("31"); break;
                    case 4 : sb.append("30"); break;
                    case 5 : sb.append("31"); break;
                    case 6 : sb.append("30"); break;
                    case 7 : sb.append("31"); break;
                    case 8 : sb.append("31"); break;
                    case 9 : sb.append("30"); break;
                    case 10 : sb.append("31"); break;
                    case 11 : sb.append("30"); break;
                    case 12 : sb.append("31"); break;
                }
            }

            System.out.println(sb);
            br.close();
        }
    }

