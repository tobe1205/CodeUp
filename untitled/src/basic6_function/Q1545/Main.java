package basic6_function.Q1545;

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
            System.out.println("non zero");
        }
    }

    static boolean zero(int n) {
        return n == 0;
    }
}
