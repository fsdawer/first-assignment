package jungol.배열;

import java.util.Scanner;

public class 배열1_연습문제1_4 {
    public static void main(String[] args) {

        int[] number = new int[100];
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.println("정수를 입력하세요 : ");
        while (count < 100) {
            int num = scanner.nextInt();
            if(num == 0) {
                break;
            }
            number[count] = num;    // number[1] = 10
            count++;
        }

        System.out.println("짝수 번쨰 입력된 정수 : ");
        for(int i = 1; i < count; i += 2) {
            System.out.println(number[i] + " ");
        }
    }
}


//number[count] = num;  num은 사용자가 입력한 값
//count++;        number[0] = 10     number[1] = 13      number[2] = 25 ......
//