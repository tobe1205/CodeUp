package basic6_function.Q1542;

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

        if (n == 2) {
            System.out.println("prime");
            return;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                System.out.println("composite");
                return;
            }
        }
        System.out.print("prime");
    }
}