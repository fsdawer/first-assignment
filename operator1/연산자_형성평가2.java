package jungol.operator1;

import java.util.Scanner;

public class 연산자_형성평가2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 입력 : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int divide = a / b;
        int remain = a % b;

        System.out.println("a / b = " + divide);
        System.out.println("a % b = " + remain);


    }
}
