package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문_형성평가7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(i * num);
        }
    }
}
