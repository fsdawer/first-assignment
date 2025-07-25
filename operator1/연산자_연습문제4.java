package jungol.operator1;

import java.util.Scanner;

public class 연산자_연습문제4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("값 입력");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a + b;

        ++a;
        b--;
        System.out.println("a = " + a + " b = " + b + " c = " + c);

    }
}
