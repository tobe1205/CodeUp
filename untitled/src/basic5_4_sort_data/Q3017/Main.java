package basic5_4_sort_data.Q3017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Student[] arr = new Student[n];

        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            Student student = new Student();
            student.num = i + 1;
            student.math = Integer.parseInt(st.nextToken());
            student.info = Integer.parseInt(st.nextToken());

            arr[i] = student;
        }
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                //수학점수를 첫번째 기준으로 정렬
                if (arr[j].math < arr[j + 1].math) {
                    Student student = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = student;
                    //수학점수가 같으면 정보점수로 정렬
                } else if (arr[j].math == arr[j + 1].math) {
                    if (arr[j].info < arr[j + 1].info) {
                        Student student = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = student;
                    }
                    //정보점수가 같다면 번호 순으로 정렬
                } else if (arr[j].info == arr[j + 1].info) {
                    if (arr[j].num > arr[j + 1].num) {
                        Student student = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = student;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%d %d %d\n", arr[i].num, arr[i].math, arr[i].info);
        }
    }
}
class Student {
    int num;
    int math;
    int info;
}



