package practice04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        /*//1024번 문제
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int len = n.length();
        for (int i = 0; i < len ; i++) {
            System.out.printf("\'%c\'\n",n.charAt(i));
        }*/
//======================================
        /*//1025번 문제
        Scanner sc = new Scanner(System.in);

        String[] cmd = sc.nextLine().split("");

        System.out.println("["+Integer.parseInt(cmd[0]) * 10000+"]");
        System.out.println("["+Integer.parseInt(cmd[1]) * 1000+"]");
        System.out.println("["+Integer.parseInt(cmd[2]) * 100+"]");
        System.out.println("["+Integer.parseInt(cmd[3]) * 10+"]");
        System.out.println("["+Integer.parseInt(cmd[4]) * 1+"]");

        sc.close();*/

//======================================
        /*//1026번 문제
        Scanner sc = new Scanner(System.in);

        String[] date = sc.nextLine().split(":");

        int hour = Integer.parseInt(date[0]);
        int minute = Integer.parseInt(date[1]);
        int second = Integer.parseInt(date[2]);

        System.out.printf("%d",minute);

        sc.close();*/
//======================================
        /*//1027번 문제
        Scanner sc = new Scanner(System.in);

        String[] date = sc.nextLine().split("\\.");

        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);

        System.out.printf("%02d-%02d-%d",day,month,year);
        sc.close();*/
//======================================
        /*//1028번 문제
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        System.out.println(x);
        sc.close();*/
//======================================
        /*//1029번 문제
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.printf("%.11f",x);

        sc.close();*/

//======================================
        /*//1030번 문제
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        System.out.println(x);
        sc.close();*/
//======================================
        /*//1031번 문제
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        System.out.printf("%o",x);

        sc.close();*/
//======================================
        /*//1032번 문제
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.printf("%x",x);

        sc.close();*/
//======================================
        /*//1033번 문제
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.printf("%X",x);

        sc.close();*/
//======================================
        /*//1034번 문제
        Scanner sc = new Scanner(System.in);
        String octalNum = sc.nextLine();

        int num = Integer.parseInt(octalNum,8);
        System.out.println(num);

        sc.close();*/
//======================================
       /* //1035번 문제
        Scanner sc = new Scanner(System.in);
        String octalNum = sc.nextLine();

        int num = Integer.parseInt(octalNum,16);
        System.out.printf("%o",num);

        sc.close();*/
//======================================
        /*//1036번 문제
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);
        int i = (int)ch;

        System.out.println(i);
        sc.close();*/
//======================================
        /*//1037번 문제
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        char ch = (char)i;

        System.out.println(ch);
        sc.close();*/
//======================================
        /*//1038번 문제
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        System.out.print(a+b);
        sc.close();
*/
//======================================
        /*//1039번 문제
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        long la,lb;

        la = Long.parseLong(a);
        lb = Long.parseLong(b);

        System.out.println(la+lb);*/
//======================================
        //1040번 문제
        Scanner sc = new Scanner(System.in);

        long lg = sc.nextLong();

        System.out.println(lg * (-1));
    }
}