package jungol.반복제어문3;

import java.util.Scanner;

public class 연습문제_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int number = scanner.nextInt();

        int sum = 0;
        int count = 1;

        while(true) {
            sum += count;   // 합(누적값 구하기)
            if(sum > number) {
                break;
            }
            count++;
        }
        System.out.println("마지막까지 더한 수 : " + count);
        System.out.println("합 : " + sum);
    }
}


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("숫자를 입력하세요 :  ");
//        int num = scanner.nextInt();
//
//        int sum = 0;
//        int i = 1;
//
//        while(true) {
//            sum += i;
//            if(sum > num) {
//                break;
//            }
//            i++;
//        }
//        System.out.println("마지막까지 더해진 수 : " + i);
//        System.out.println("그때까지의 합 : " + sum);