package jungol.배열;

import java.util.Scanner;

public class 배열1_형성평가2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        int sum = 0;

        for(int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        sum = number[0] + number[2] + number[4];
        System.out.println(sum);
    }
}
