package jungol.배열;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 배열1_연습문제1_6 {
    public static void main(String[] args) {
//
//        int[] number = new int[10];
//        Scanner input = new Scanner(System.in);
//        System.out.println("10개의 값을 입력하세요 : ");
//
//        for(int i = 0; i < number.length; i++) {
//            number[i] = input.nextInt();     // number[i] -> number[0], number[1], number[2] .... 값 저장
//        }
//
//        int max = number[0];   // max를 0번째로 초기화
//
//        for(int i = 0; i < number.length; i++) {
//            if(number[i] > max) {     //  저장된 값을 하나씩 비교
//                max = number[i];
//            }
//        }
//        System.out.println("가장 큰 수는 " + max + "입니다");

        Scanner scanner = new Scanner(System.in);

        Integer[] outputArray = new Integer[10];
        for(int i = 0; i < outputArray.length; i++) {
            outputArray[i] = scanner.nextInt();
        }

        Arrays.sort(outputArray , Collections.reverseOrder());
        System.out.println(outputArray[0]);
    }
}
