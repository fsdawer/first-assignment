package jungol.operator1;

import java.util.Scanner;

public class 연산자_형성평가3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int length = scanner.nextInt();

        int a = width + 5;
        int b = length * 2;
        int area = a * b;

        System.out.println("width = " + a);
        System.out.println("lengh = " + b);
        System.out.println("area = " + area);


    }
}
