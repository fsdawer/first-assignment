package jungol.operator1;

import java.util.Scanner;

public class 연산자_연습문제1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("두개의 수를 입력하시오 : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;
        int minus = a - b;
        int multiply = a * b;
        int divide = a / b;
        int remain = a % b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + minus);
        System.out.println(a + " * " + b + " = " + multiply);
        System.out.println(a + " / " + b + " = " + divide);
        System.out.println(a + " % " + b + " = " + remain);
    }
}
