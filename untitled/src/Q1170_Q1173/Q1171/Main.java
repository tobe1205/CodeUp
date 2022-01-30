package Q1170_Q1173.Q1171;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");

        String a = arr[0];
        String b = arr[1];
        String c = arr[2];

        if (b.length()>= 2) b = arr[1];
        else b = "0"+arr[1];

        if (c.length()==1) c = "0"+"0"+arr[2];
        else if (c.length() == 2) c = "0" +arr[2];
        else c = arr[2];

        System.out.print(a+b+c);
    }
}
