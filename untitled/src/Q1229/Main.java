package Q1229;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //키와 몸무게 입력
        double height = sc.nextDouble();
        double weight = sc.nextDouble();
        //표준몸무게 저장을 위한 변수 생성
        double standWeight;
        //키 값에 따라 표준몸무게 계산
        if (height >= 160) {
            standWeight = (height - 100) * 0.9;
        } else if (height >= 150) {
            standWeight = (height - 150) / 2 + 50;
        } else {
            standWeight = (height - 100);
        }

        //비만도 계산 후 저장
        double bmi = (weight - standWeight) * 100 / standWeight;

//        System.out.println(standWeight);
//        System.out.println(bmi);

        //비만도에 따른 등급 출력
        if(bmi > 20) {
            System.out.print("비만");
        } else if (bmi >= 10) {
            System.out.print("과체중");
        } else
            System.out.print("정상");
    }
}
