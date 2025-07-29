package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문_형성평가2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("100 이하의 두 정수를 입력하세요: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > 100 || b > 100 || a < 0 || b < 0) {
            System.out.println("두 수 모두 0 이상 100 이하이어야 합니다.");
            return;
        }

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
    }
}
