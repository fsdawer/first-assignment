package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. 삽입   2. 수정   3. 삭제 ");
        System.out.println("숫자를 선택하세요 : ");

        int choice = scanner.nextInt();

        if(choice == 1) {
            System.out.println("삽입을 선택했습니다");
        } else if(choice == 2) {
            System.out.println("수정을 선택했습니다");
        } else if(choice == 3){
            System.out.println("삭제를 선택했습니다");
        } else {
            System.out.println("값이 없습니다");
        }


    }
}
