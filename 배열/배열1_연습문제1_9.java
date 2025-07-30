package jungol.배열;

import java.util.Arrays;
import java.util.Scanner;

public class 배열1_연습문제1_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[10];

        for(int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }

        System.out.print("총점 : %d \n");


    }
}
