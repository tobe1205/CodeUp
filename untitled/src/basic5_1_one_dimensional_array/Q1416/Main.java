package basic5_1_one_dimensional_array.Q1416;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt(); //입력받을 정수를 저장할 변수

        /*
        Integer.toBinaryString(int i) 메서드는 입력받은 정수를 2진수로 바꿔주는 메서드이다.
        추가 :
        Integer.toOctalString(int i) - 8진수
        Integer.toHexString(int i) - 16진수로 변경 할 수 있다.

        그렇다면 반대로 2진수, 8진수, 16진수를 10진수로 변환하려면
        Integer 클래스의 parseInt 메서드를 사용해서 쉽게 변환이 가능하다.
        Integer.parseInt(String s, int n진수); //return int
        ex) 127입력
        int i = 127;
        //toBinaryString 메서드로 i의 값 127을 2진수로 변환
        String e = Integer.toBinaryString(i);
        //변환한 값을 parseInt를 이용해서 10진수로 변환
        int p = Integer.parseInt(e,2);

        System.out.println(p);
         */

        String answer = Integer.toBinaryString(s);

        System.out.println(answer);

    }
}
