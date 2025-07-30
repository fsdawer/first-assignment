package jungol.배열;

import java.util.Scanner;

public class 배열_자가진단1 {
    public static void main(String[] args) {

        char[] array = new char[10];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            array[i] = scanner.next().charAt(0);
        }
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
