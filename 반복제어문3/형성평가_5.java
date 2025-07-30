package jungol.반복제어문3;

import java.util.Scanner;

public class 형성평가_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 별 출력 (2*i - 1개)
            for(int j = 1; j<= (2*i) -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// 2 * i - 1 (홀수 구하는 공식)
// i = 1 -> j = 1,2
// i = 2 -> j = 1,