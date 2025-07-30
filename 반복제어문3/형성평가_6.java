package jungol.반복제어문3;

import java.util.Scanner;

public class 형성평가_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j--) {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.println(j);
            }
        }
    }
}

