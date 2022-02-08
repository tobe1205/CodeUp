package Q1228;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //키와 몸무게 값 입력
        double height = sc.nextDouble();
        double weight = sc.nextDouble();

        //평균몸무게
        double standard = (height - 100) * 0.9;
        //비만도
        double obesity = (weight - standard) * 100 / standard;

        if(obesity > 20) {
            System.out.print("비만");
        } else if (obesity >= 10){
            System.out.print("과체중");
        } else {
            System.out.println("정상");
        }
    }
}
