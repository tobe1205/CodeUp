package basic5_2_string.Q1734;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ID = br.readLine();

            System.out.print("welcome! "+ID);
            br.close();
    }
}
