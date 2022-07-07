package basic6_function.Q1546;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (zero(n)) {
            System.out.println("zero");
        } else {
            System.out.printf("%s", plus(n) ? "plus" : "minus"); //삼항연산자 사용
        }
    }

    static boolean plus(int n) {
        return n > 0;
    }

    static boolean zero(int n) {
        return n == 0;
    }
}
