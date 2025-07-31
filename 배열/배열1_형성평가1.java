package jungol.배열;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 배열1_형성평가1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] chars = new char[10];
        System.out.println("문자를 입력하세요 : ");

        for(int i = 0; i < chars.length; i++) {
            chars[i] = sc.next().charAt(0);  // 한문자씩 입력받기
        }
        for(int i = 9; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
