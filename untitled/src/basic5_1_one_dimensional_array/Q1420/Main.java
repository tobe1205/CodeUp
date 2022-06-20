package basic5_1_one_dimensional_array.Q1420;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //n명의 친구 수
        sc.nextLine();

        int[] score = new int[n]; //점수를 저장할 int 배열
        String[] students = new String[n]; //이름을 저장할 String 배열
        int[] rank = new int[n]; //랭크를 저장할 int 배열

        for (int i = 0; i < n; i++) {
            String[] nameScore = sc.nextLine().split(" ");//이름과 점수
            students[i] = nameScore[0]; //이름은 students에 저장
            score[i] = Integer.parseInt(nameScore[1]); //점수는 score에 저장
        }

//        System.out.println(Arrays.toString(students));
//        System.out.println(Arrays.toString(score));

        for (int i = 0; i < score.length; i++) {
            rank[i] = 1; //랭크는 1로 초기화
            for (int j = 0; j < score.length; j++) {
                if(score[i] < score[j]){
                    rank[i]++;
                }
            }
        }

        for (int i = 0; i < rank.length; i++) {
            if(rank[i] == 3){
                System.out.println(students[i]);
            }
        }
    }
}
