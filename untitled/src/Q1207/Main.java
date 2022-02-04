package Q1207;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //4개의 숫자를 입력 받는다.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        //몇개가 뒤집어져 있는지 확인
        int sum = a+b+c+d;
        //더해서 나온 값을 기준으로 결과 출력
        if(sum == 0) System.out.print("모");
        else if(sum == 1) System.out.print("도");
        else if(sum == 2) System.out.print("개");
        else if(sum == 3) System.out.print("걸");
        else if(sum == 4) System.out.print("윷");

    }

}
