package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a > 4 && b > 4) {
            System.out.println("이겼습니다");
        } else if (a > 4 || b > 4) {
            System.out.println("비겼습니다");
        } else {
            System.out.println("졌습니다");
        }
    }
}
