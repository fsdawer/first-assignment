package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문_형성평가6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("두 정수를 입력하세요 :  ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        int sum = 0;
        int count = 0;

        for (int i = start; i <= end; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
                count++;
            }
        }

        // 평균 계산
        double average = (double) sum / count;
        System.out.println("합 :" + sum);
        System.out.printf("평균 : %.1f : " , average);
    }
}
