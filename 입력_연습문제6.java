package jungol;

import java.util.Scanner;

public class 입력_연습문제6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("당신의 나이는 몇살입니까?");
        int age = scanner.nextInt();
        System.out.println("당신의 나이는 " + age + "살 이군요");
    }
}
