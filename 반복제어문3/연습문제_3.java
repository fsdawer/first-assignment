package jungol.반복제어문3;

import java.util.Scanner;

public class 연습문제_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("별 출력 : ");
        int a = scanner.nextInt();


        // 별 증가 부분
        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 별 감소 부분
        for(int i = a-1; i >= 1; i--) {   // 입력된 값이 6이면 a = 5   (세로)
            for(int j = 1; j <= i; j++) {  // a가 5이면 j는 1부터 i(5)까지 출력이니까 *이 5개 출력 (가로)
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
