package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int a = scanner.nextInt();

        if(a > 80) {
            System.out.println("합격입니다");
        } else {
            System.out.println("불합격입니다");
        }
    }
}
