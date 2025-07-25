package jungol.operator1;

import java.util.Scanner;

public class 연산자_형성평가5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("민수 키 입력 : ");
        int minsuWeight = scanner.nextInt();
        System.out.println("민수 몸무게 입력 :");
        int minsuHeight = scanner.nextInt();

        System.out.println("기영 키 입력 : ");
        int giyongWeight = scanner.nextInt();
        System.out.println("민수 몸무게 입력 : ");
        int giyongHeight = scanner.nextInt();

        int result = 0;

        if(minsuHeight > giyongHeight && minsuWeight > giyongWeight) {
            result = 1;
        }

        System.out.println(result);
    }
}
