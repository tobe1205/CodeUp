package basic6_function.Q1541;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        f(n);
    }

    static void f(int n) {
        if (n < 0) {
            System.out.println("negative");
        } else if (n == 0) {
            System.out.println("zero");
        } else {
            System.out.println("positive");
        }
    }
}
