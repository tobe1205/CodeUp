package basic5_2_string.Q1754;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int l1 = 0, l2 = 0;
        //숫자 2개를 String으로 받음.
        String word1 = scan.next();
        String word2 = scan.next();
        //글자수 만큼 배열 생성
        char[] str1 = new char[word1.length()];
        char[] str2 = new char[word2.length()];
        int i = 0;
        //배열에 1글자씩 넣기
        for(i = 0; i < str1.length; i++){
            str1[i] = word1.charAt(i);
        }
        for(i = 0; i < str2.length; i++){
            str2[i] = word2.charAt(i);
        }
        //만약 길이가 1이 더 길다면 2 1 반대면 1 2
        if (str1.length > str2.length)
        {
            System.out.printf("%s %s", word2, word1);
        }
        else if (str1.length < str2.length)
        {
            System.out.printf("%s %s", word1, word2);
        }
        //글자 길이가 같은 경우
        else
        {
            //1개씩 비교해서 str1이 더 크면 2 1 아니면 1 2
            for(i = 0; i < str2.length; i++){
                if (str1[i] > str2[i])
                {
                    System.out.printf("%s %s", word2, word1);
                    break;
                }
                else if (str1[i] < str2[i])
                {
                    System.out.printf("%s %s", word1, word2);
                    break;
                }
                else ;
            }
        }


    }
}
