package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문_형성평가5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int even = 0;   // 짝수
        int odd = 0;    // 홀수

        for(int i = 0; i < 10; i++) {
            number = scanner.nextInt();
            if (number % 2 == 0) {
                even++;
            } else if(number % 2 == 1) {
                odd++;
            }
        }
        System.out.println("even : " + even + " odd : " + odd);
    }
}
