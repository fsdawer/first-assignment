package jungol.operator1;

import java.util.Scanner;

public class 연산자_연습문제7 {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c = 2;

        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;

        if (a != 0 && b != 0) {
            result1 = 1;
        }
        if (a != 0 || b != 0) {
            result2 = 1;
        }
        if (b != 0 && c != 0) {
            result3 = 1;
        }
        if (a == 0) {
            result4 = 1;
        }
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
