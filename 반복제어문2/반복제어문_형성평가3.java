package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문_형성평가3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        for(int i = 1; i <= number; i++) {
            if(i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
