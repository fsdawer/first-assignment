package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_연습문제5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int count = 0;

        for(int i = 0; i <= 10; i++) {
            num = scanner.nextInt();
        } if(num % 2 == 0) {
            count++;   // 개수 세기
        }
        System.out.println("입력 받은 짝수는 " + count);
    }
}
