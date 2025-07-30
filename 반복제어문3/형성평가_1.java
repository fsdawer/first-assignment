package jungol.반복제어문3;

import java.util.Scanner;

public class 형성평가_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        for(int i = 0; i < 20; i++) {
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }
            sum += num;
            count++;
        }

        if(count > 0) {
            int average = sum / count;
            System.out.println("합계 : " + sum);
            System.out.println("평균 : " + average);
        } else {
            System.out.println("0이외의 수가 입력되지 않았습니다");
        }

    }
}
