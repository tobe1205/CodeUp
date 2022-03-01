package basic4_1_whileFor.Q1277;

import java.util.Scanner;

public class Answer2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a,b=0,c=0,d=0;
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            if(i== 0)b=a;
            if(i == (n-1)/2)c=a;
            if(i == n-1)d=a;
        }
        System.out.println(b+" "+c+" "+d);
    }//main
}