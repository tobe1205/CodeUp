package practice01;

public class Main {

    public static void main(String[] args) {

        /*
        7번 문제 : "C:\Download\hello.cpp" 출력하기.

        핵심 내용 :
            1. \ 백슬래시 " 큰따옴표를 출력할때는 \\ \" 식으로 출력해야한다.
         */
        System.out.println("\"C:\\Download\\hello.cpp\"");

        /*
        8번 문제 : 특수문자 출력하기

        핵심 내용 : 키보드로 출력할 수 없는 특수문자를 유니코드를 이용해서 출력한다.
                            ┌┬┐
                            ├┼┤
                            └┴┘
         */
        System.out.println("\u250C\u252C\u2510");
        System.out.println("\u251C\u253c\u2524");
        System.out.println("\u2514\u2534\u2518");

        //9번 문제 : Hello, World!  출력
        System.out.print("Hello, World!\n");

        System.out.println("====================");
        //10번 문제 : Hello,
        //           World! 출력

        System.out.print("Hello,\nWorld!");

//        int a = –2147483648;
        int b = 2147483647;




    }
}
