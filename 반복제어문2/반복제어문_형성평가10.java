package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문_형성평가10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();


        if(num1 > num2) {
            for(int i = 1; i <= 9; i++) {
                for(int j = num1; j >= num2; j--) {
                    System.out.printf("%d * %d = %2d   " , i, j, i * j);
                }
                System.out.println();
            }
        }else {
            for(int i = 1; i <= 9; i++) {
                for(int j = num1; j <= num2; j++) {
                    System.out.printf("%d * %d = %2d" , i, j, i * j);
                }
                System.out.println();
            }
        }
    }
}






//
//        Scanner scanner = new Scanner(System.in);
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//
//        if (num1 >= num2) {
//            for(int i = 1; i <= 9; i++) {  // 열(세로)
//                for(int j = num1; j >= num2; j--) {  // 행(가로)
//                    System.out.printf("%d * %d = %2d   " , j, i, j * i);
//                }
//                System.out.println();
//            }
//        } else {
//            for(int i = 1; i <= 9; i++) {
//                for(int j = num1; j <= num2; j++) {
//                    System.out.printf("%d * %d = %2d   " , j, i, j * i);
//                }
//                System.out.println();
//            }
//        }