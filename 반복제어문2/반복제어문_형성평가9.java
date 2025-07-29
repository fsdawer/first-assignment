package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문_형성평가9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= num; j++) {
                    System.out.print("(" + i + ",  " + j + ")");
                }
            System.out.println(" ");   // i, j 가 끝나면 밖으로 나오니까 밖에 줄바꿈 표시 해야됨
            }
    }
}
