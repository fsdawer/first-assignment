package jungol.operator1;

import java.util.Scanner;

public class 연산자_연습문제5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a == b) {
            System.out.println("1");
        } else if(b == c) {
            System.out.println("1");
        } else if(c == a) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
