package Q1180;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int n1 = n / 10; //10의 자리수를 1의자리수로
        int n2 = (n % 10) * 10; //1의자리수를 10의자리수로

        //바꾼 값의 *2
        int result = (n1 + n2) * 2;

        //수치가 100이 넘으면 100의 자리수 무시
        if (result >= 100) {
            result -= 100;
        }
        System.out.println(result);

        if(result<=50) System.out.println("GOOD");
        else System.out.println("OH MY GOD");
    }
}
