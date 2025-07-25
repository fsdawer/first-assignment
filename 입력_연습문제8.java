package jungol;

import java.util.Scanner;

public class 입력_연습문제8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("키를 입력하세요 : ");
        int height = scanner.nextInt();

        System.out.println("몸무게를 입력하세요 : ");
        double weight = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("이름을 입력하세요 :");
        String name = scanner.nextLine();

        System.out.println("키 = " + height);
        System.out.println(String.format("%.1f" , weight));
        System.out.println("이름 = " + name);


    }
}
