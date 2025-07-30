package jungol.배열;

import java.util.Scanner;

public class 배열1_연습문제1_2 {
    public static void main(String[] args) {

        char[] array = new char[26];


        // 'A' 부터 'Z'까지 배열에 저장
        for(int i = 0; i < 26; i++) {
            array[i] = (char) ('A' + i);
        }

        System.out.println("Z부터A까지 출력 : ");
        for(int i = 26; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
