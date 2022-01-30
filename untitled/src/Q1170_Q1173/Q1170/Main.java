package Q1170_Q1173.Q1170;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //정수 3개 입력받음.
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        //String으로 타입 변환
        String a = String.valueOf(x);
        String b = String.valueOf(y);
        String c;

        //z 값이 10미만일때 문자 0을 추가. 10이상이면 그대로
        if (z<10) {
            c = "0" + z;
        } else {
            c = String.valueOf(z);
        }

        String result = a + b + c ;
        System.out.print(result);
    }
}
