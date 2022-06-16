package basic5_1_one_dimensional_array.Q1407;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //" " 공백을 기준으로 입력받은 문자열을 String배열에 각각 저장한다.
        String[] string = sc.nextLine().split(" ");

        //그리고 배열에 저장된 값을 하나씩 출력한다.
        for (String s : string) {
            System.out.print(s);
        }
        sc.close();
    }
}
