package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int a = scanner.nextInt();

        if(a > 10) {
            System.out.println(a);
            System.out.println("10보다 큰 수를 입력하셨습니다");
        }
    }
}
