package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문_형성평가8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("행의 수를 입력하세요 : ");
        int num1 = scanner.nextInt();

        System.out.println("열의 수를 입력하세요 : ");
        int num2 = scanner.nextInt();

        for(int i = 1; i <= num1; i++) {     //      i = 1 일때 j = 1,2,3,4
            for(int j = 1; j <= num2; j++) {  //     i = 2일때 j = 2,4,6,8
                System.out.print(i * j + " ");  //   i = 3일때 j = 3 6 9 12
            }
            System.out.println(" ");
        }

    }
}
