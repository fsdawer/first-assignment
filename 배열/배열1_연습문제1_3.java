package jungol.배열;

import java.util.Scanner;

public class 배열1_연습문제1_3 {
    public static void main(String[] args) {

        int[] number = new int[10];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            number[i] = scanner.nextInt();
        }
        for(int i = 0; i < 10; i++ ) {
            if(i==2 || i == 4 || i == 9){
                System.out.printf("%d" , number[i] , " ");
            }
        }
    }
}
