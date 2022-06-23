package basic5_2_string.Q1414;

import java.util.Locale;
import java.util.Scanner;

public class Answer3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next().toLowerCase();

        int cnt = 0;
        int cnt2 = 0;
        char[] arr = s.toCharArray(); //문자를 char타입 배열로 바꿔준다.
        //문자열의 공백또한 인덱스에 포함한다. 조심.
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]=='c') {
                cnt++;
            }if(i != arr.length-1){
                if(arr[i]=='c'&& arr[i+1]== 'c'){
                    cnt2++;
                }
            }
        }
        System.out.println(cnt);
        System.out.print(cnt2);
    }
}
