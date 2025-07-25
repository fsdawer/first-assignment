package jungol;

import java.util.Scanner;

public class 입력_연습문제9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("두개의 실수를 입력하세요 : ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        System.out.println(String.format("%.2f ", x));
        System.out.println(String.format("%.2f ", y));


        int a = 10;
        int b = 20;
        System.out.println("a" + "b" + a+b);


    }
}
