package jungol.배열;

import java.util.Scanner;

public class 배열1_연습문제1_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Year = ");
            int year = input.nextInt();

            System.out.print("Month = ");
            int month = input.nextInt();

            if (month == 0) {
                System.out.println("잘못 입력하셨습니다");
                break;
            }

            if (month < 1 || month > 12) {
                System.out.println("잘못 입력하셨습니다");
                continue;
            }

            int days = 0;

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
            }
            System.out.println("입력하신 달의 날 수는" + days + "일입니다.");
        }
    }
}
