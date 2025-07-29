package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a > b) {
            System.out.println("입력받은 수 중 큰 수는 " + a);
            System.out.println("입력받은 수 중 작은 수는 " + b);
        } else {
            System.out.println("입력받은 수 중 큰 수는 " + b);
            System.out.println("입력받은 수 중 작은 수는 " + a);
        }
    }
}
