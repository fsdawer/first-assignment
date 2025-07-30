package jungol.배열;

import java.util.Scanner;

public class 배열1_연습문제1_8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] num = new int[10];
        int sum = 0;
        double average = 0;

        for(int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }
        for(int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        average = (double) sum / num.length;
        System.out.println("총점 = " + sum);
        System.out.printf("평균 = %.2f ", average);
    }
}
