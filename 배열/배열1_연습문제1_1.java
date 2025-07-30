package jungol.배열;

import java.util.Scanner;

public class 배열1_연습문제1_1 {
    public static void main(String[] args) {

        int[] num = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 5개를 입력해주세요");
        for(int i = 0; i < 5; i++) {
            num[i] = scanner.nextInt();
        }

        System.out.println("입력한 정수 : ");
        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
