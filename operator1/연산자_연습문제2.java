package jungol.operator1;

import java.util.Scanner;

public class 연산자_연습문제2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] input = new int[5];
        int[] result = new int[5];

        System.out.println("정수 5개를 입력하세요 : ");
        for(int i = 0; i < 5; i++) {
            input[i] = scanner.nextInt();
        }
        result[0] = input[0] + 3;
        result[1] = input[1] - 3;
        result[2] = input[2] * 3;
        result[3] = input[3] / 3;
        result[4] = input[4] % 3;

        System.out.println("연산 결과 : ");
        for(int i = 0; i < 5; i++) {
            System.out.println(result[i]);
        }

    }
}
