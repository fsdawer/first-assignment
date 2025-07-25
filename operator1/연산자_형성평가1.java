package jungol.operator1;

import java.util.Scanner;

public class 연산자_형성평가1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int kor, eng, math, com;

        System.out.print("국어 점수 입력: ");
        kor = scanner.nextInt();

        System.out.print("영어 점수 입력: ");
        eng = scanner.nextInt();

        System.out.print("수학 점수 입력: ");
        math = scanner.nextInt();

        System.out.print("컴퓨터 점수 입력: ");
        com = scanner.nextInt();

        int total = kor + eng + math + com;
        int average = total / 4;  // 정수 나눗셈이므로 자동으로 소수점 이하 버림

        System.out.println("총점: " + total);
        System.out.println("평균: " + average);
    }
}
