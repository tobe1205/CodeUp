package basic4_1_whileFor.Q1285;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] num = s.split("\\+|\\-|\\*|/|\\=");
        String[] mark = s.split("1|2|3|4|5|6|7|8|9|0| ");

        String markStr = "";
        for (int i = 0; i < mark.length; i++) {
            if (!mark[i].equals(" ")) {
                markStr += mark[i];
            }
        }
        String[] mark2 = markStr.split("");

        int[] number = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            number[i] = Integer.parseInt(num[i]);
        }

        for (int i = 0; i < mark2.length; i++) {
            if (mark2[i].equals("=")) break;
            else {
                if(mark2[i].equals("+")){
                    number[i+1] = number[i] + number[i+1];
                }else if (mark2[i].equals("-")){
                    number[i+1] = number[i] - number[i+1];
                }else if (mark2[i].equals("*")){
                    number[i+1] = number[i] * number[i+1];
                }else if (mark2[i].equals("/")){
                    number[i+1] = number[i] / number[i+1];
                }
                }
            }
        System.out.print(number[number.length-1]);
        }
    }



