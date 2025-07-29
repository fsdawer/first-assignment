package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문_형성평가4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("100 이하의 자연수 n을 입력하세요: ");
        int n = scanner.nextInt();
        int sum = 0;

        for(int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            sum += num;
        }

        double average = (double) sum / n;

        System.out.printf("평균은 %.2f 입니다\n" , average);

    }
}
