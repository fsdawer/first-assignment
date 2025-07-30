package jungol.반복제어문3;

import java.util.Scanner;

public class 형성평가_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int number = scanner.nextInt();

        for (int i = 1; i * number <= 100; i++) {
            int multiple = i * number;
            System.out.print(multiple + " ");

            if(multiple % 10 == 0) {
                break;
            }
        }
    }
}
