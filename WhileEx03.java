package day5;

import java.util.Scanner;

public class WhileEx03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 속도의 증감을 비교할 변수
        boolean run = true;

        // 속도값 조절 변수
        int speed = 0;

        while(run) {    // run = true니까 while에 run 넣으면 무한 반복
            System.out.println("----------------------------------");
            System.out.println("1.증가   |   2. 감소   |   3. 종료 ");
            System.out.println("----------------------------------");
            System.out.println("선택하세요 : ");

            String stringNum = scanner.nextLine();

            if(stringNum.equals("1")) {
                speed++;
                System.out.println("현재 속도 = "  + speed);
            } else if(stringNum.equals("2")) {
                speed--;
                System.out.println("현재 속도 = " + speed);
            } else if(stringNum.equals("3")) {
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
