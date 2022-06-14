package basic4_2_nestedLoop.Q1382;

public class Main {
    public static void main(String[] args) {

        /*
        입력 없이 바로 for문을 통해서 2~5단까지 출력하면 된다.
         */

        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.printf("%d x %d = %2d\t",j,i,j*i);
            }
            System.out.println();
        }
    }
}
