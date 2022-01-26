package Q1041_Q1048;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*//1041번문제
        Scanner sc = new Scanner(System.in);
        char str = sc.nextLine().charAt(0);
        System.out.println((char)(str + 1));

        sc.close();*/
//======================================
        /*//1042번문제
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        int x = Integer.parseInt(a[0]);
        int y = Integer.parseInt(a[1]);
        System.out.println(x / y);
        sc.close();*/
//======================================
        /*//1043번문제
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        int x = Integer.parseInt(a[0]);
        int y = Integer.parseInt(a[1]);
        System.out.println(x % y);
        sc.close();*/
//======================================
       /* //1044번문제
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print((long)a+1);
        sc.close();*/
//======================================
        /*//1045번문제
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        int x = Integer.parseInt(a[0]);
        int y = Integer.parseInt(a[1]);
        System.out.printf("%d\n",x + y);
        System.out.printf("%d\n",x - y);
        System.out.printf("%d\n",x * y);
        System.out.printf("%d\n",x / y);
        System.out.printf("%d\n",x % y);
        System.out.printf("%.2f\n",(double)x/y);
        sc.close();*/
//======================================
        /*//1046번문제
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        int x = Integer.parseInt(a[0]);
        int y = Integer.parseInt(a[1]);
        int z = Integer.parseInt(a[2]);
        int sum = x + y + z;
        int average = sum / 3;
        System.out.println(sum);
        System.out.printf("%.1f%n",(float)sum/3);
        sc.close();*/

        /*Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String[] str2 = str1.split(" ");
        long sum1 = 0;
        double avg = 0;

        for(int i=0; i<str2.length; i++){
            int num =Integer.parseInt(str2[i]);
            if(num >= -2147483648 && num <= 2147483647){
                sum1 += num;
            }else{ System.out.println("-2147483648 ~ 2147483647사이의 정수를 입력하세요.");
                break;
            }
        }
        avg = (double)sum1/3; System.out.println(sum1);
        System.out.format("%.1f", (double)sum1/3);*/
//======================================
        /*//1047번문제
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a<<1);
        sc.close();*/
//======================================
        //1048번문제
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a<<b);
        sc.close();
    }
}
