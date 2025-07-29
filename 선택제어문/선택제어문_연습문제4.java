package jungol.선택제어문;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 선택제어문_연습문제4 {

    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("숫자를 입력하세요 : ");
            int score = scanner.nextInt();
            char grade;

            if (score >= 90 && score <= 100) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'c';
            } else if (score >= 60) {
                grade = 'd';
            } else {
                grade = 'f';
            }
            System.out.println(grade);
        } catch (InputMismatchException e) {
            System.out.println("숫자만 입력 가능합니다");
        }
    }
}
