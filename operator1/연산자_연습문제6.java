package jungol.operator1;

import java.util.Scanner;

public class 연산자_연습문제6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        if (b >= c) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        if (a <= b) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        if (b < c) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
