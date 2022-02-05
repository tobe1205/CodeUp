package Q1210;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        int sum = 0;

        //Main과 동일하나 for문을 통한 코드 간결화
        for (int i = 0; i < 2; i++) {
            switch (sc.nextInt()) {
                case 1 : sum += 400; break;
                case 2 : sum += 340; break;
                case 3 : sum += 170; break;
                case 4 : sum += 100; break;
                case 5 : sum += 70; break;
            }
        }

//        System.out.println(sum>500? "angry":"no angry" ); //삼항연산자로도 출력 가능
        if(sum > 500) System.out.print("angry");
        else System.out.print("no angry");
    }

}
