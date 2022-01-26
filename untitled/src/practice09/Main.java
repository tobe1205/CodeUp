package practice09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //1065번
        /*Scanner sc = new Scanner(System.in);

        //3개의 값을 입력받는다.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 각각 if문으로 조건 : 2의배수일시(짝수) 출력 아니면 출력 x
        if (a%2==0) System.out.println(a);
        if (b%2==0) System.out.println(b);
        if (c%2==0) System.out.println(c);*/

        //--------------------------------

        //1066번
        /*Scanner sc = new Scanner(System.in);

        //3개의 값을 입력받는다.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 각각 삼항연산자 : 짝수면 even, 홀수면 odd 출력
        System.out.println((a%2==0)? "even" : "odd");
        System.out.println((b%2==0)? "even" : "odd");
        System.out.println((c%2==0)? "even" : "odd");*/

        //--------------------------------

        //1067번
        /*Scanner sc = new Scanner(System.in);

        //1개의 값을 입력받는다.
        int a = sc.nextInt();

        if(a>0){
            System.out.println("plus");
        } else {
            System.out.println("minus");
        }
        if (a%2 ==0)System.out.println("even");
        else System.out.println("odd");*/

        //--------------------------------

        //1068번
        /*Scanner sc = new Scanner(System.in);

        //1개의 값을 입력받는다.
        int a = sc.nextInt();

        if(a>=90) {
            System.out.println("A");
        } else if(a >=70){
            System.out.println("B");
        } else if(a >= 40){
            System.out.println("C");
        } else {
            System.out.println("D");
        }*/

        //--------------------------------

        /*//1069번
        Scanner sc = new Scanner(System.in);

        //1개의 값을 입력받는다.
        String rating = sc.next();

        //switch~ case문을 이용해서 입력된 값에 따라 다르게 출력 하게 할 수있다.
        //default 는 케이스값 이외의 값을 입력하는 모든것을 뜻하며 if문의 else와 비슷하다고 할 수 있다.
        switch (rating) {
            case "A":
                System.out.println("best!!!");
                break;
            case "B":
                System.out.println("good!!");
                break;
            case "C":
                System.out.println("run!");
                break;
            case "D":
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
                break;
        }*/

        //--------------------------------

        //1070번
        Scanner sc = new Scanner(System.in);

        //1개의 값을 입력받는다.
        int season = sc.nextInt();

        switch (season) {
            case 12 : case 1 : case 2 :
                System.out.println("winter");
                break;
            case 3 : case 4 : case 5 :
                System.out.println("spring");
                break;
            case 6 : case 7 : case 8 :
                System.out.println("summer");
                break;
            case 9 : case 10 : case 11 :
                System.out.println("fall");
                break;
        }
    }
}
