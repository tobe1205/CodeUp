package Q1231;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        String[] arr;

        if (a.contains("+")) {
            arr = a.split("\\+");
            System.out.print(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
        } else if (a.contains("-")) {
            arr = a.split("-");
            System.out.print(Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]));
        } else if (a.contains("*")) {
            arr = a.split("\\*");
            System.out.print(Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]));
        } else if (a.contains("/")) {
            arr = a.split("/");
            System.out.printf("%.2f", (double) Integer.parseInt(arr[0]) / Integer.parseInt(arr[1]));
        }
    }

}


