package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("세개의 숫자를 입력하세요 : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
//
//        int max = a;
//
//        if(b > max ) {
//            max = b;
//        } else if(c > max) {
//            max = c;
//        }
//        System.out.println("최대값은 " + max + "입니다");

        int result1 = Math.max(a, b);
        int result2 = Math.max(b, c);

        int maxValue = Math.max(result1, result2);
        System.out.println("입력받은 수 중에서 가장 큰 수는 " + maxValue);
    }
}
