package jungol.operator1;

import java.util.Scanner;

public class 연산자_형성평가4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        ++a;
        System.out.println("a = " + a + " b = " + b);
        b--;
        System.out.println("a = " + a + " b = " + b);
    }
}
