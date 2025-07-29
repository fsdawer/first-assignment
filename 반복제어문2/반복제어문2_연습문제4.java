package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_연습문제4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int number = scanner.nextInt();
        int result = 0;

        for(int i =1; i <= number; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
