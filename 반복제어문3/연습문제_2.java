package jungol.반복제어문3;

import java.util.Scanner;

public class 연습문제_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for(int i = 1; i <= a; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
