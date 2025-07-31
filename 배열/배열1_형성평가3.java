package jungol.배열;

import java.util.Scanner;

public class 배열1_형성평가3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] number = new int[10];
        int oddsum = 0; // 홀수 합
        int evensum = 0; // 짝수 합

        for(int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();

            if(i % 2 == 1) {  // 1, 3, 5, 7, 9
                oddsum += number[i];
            } else {
                evensum += number[i];
            }
        }

        System.out.println("odd  : " + evensum);
        System.out.println("evensum  : " + oddsum);


    }
}
