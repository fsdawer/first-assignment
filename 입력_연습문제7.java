package jungol;

import java.util.Scanner;

public class 입력_연습문제7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("두 수를 입력하시오");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int average = a * b;
        int sum = a + b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b +" = " + average);
    }
}
