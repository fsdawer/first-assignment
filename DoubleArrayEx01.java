package day07;

import java.util.Scanner;

public class DoubleArrayEx01 {
    public static void main(String[] args) {

        // 학생 3명의 국어, 영어, 수학 점수를 관리하는 2차원 배열을 만드세요
//        int[][] scores = new int[3][3];
//
//
//        // 1번 학생
//        scores[0][0] = 90;
//        scores[0][1] = 50;
//        scores[0][2] = 80;
//
//        // 2번 학생
//        scores[1][0] = 40;
//        scores[1][1] = 60;
//        scores[1][2] = 90;
//
//        // 3번 학생
//        scores[2][0] = 30;
//        scores[2][1] = 66;
//        scores[2][2] = 34;
//
//
//        for (int i = 0; i < scores.length; i++) {
//            int kor = scores[i][0];           // 국어는 [i][1]  /  영어는 [i][1] / 수학은 [i][2] 이니까
//            int english = scores[i][1];       // 1,2,3번 학생을 i로 둠
//            int math = scores[i][2];
//
//            int sum = kor + english + math;
//            double average = sum / scores.length;
//
//            System.out.println(i+1 + "번 학생 : ");
//            System.out.println(" 국어 점수 : " + kor + " 영어 점수 : " + english + " 수학점수 : " + math +
//                    " 총점 : " + sum + " 평균 : " + average);
//        }


        Scanner scanner = new Scanner(System.in);
        int scores[][] = new int[3][3];

        // 점수 입력
        for(int i = 0; i < scores.length; i++) {
            System.out.println(i+1 + "번째 학생 점수 입력 : ");
            System.out.println("국어 점수 : ");
            scores[i][0] = scanner.nextInt();

            System.out.println("영어 점수 : ");
            scores[i][1] = scanner.nextInt();

            System.out.println("수학 점수 : ");
            scores[i][2] = scanner.nextInt();
        }

        // 출력
        for(int i = 0; i < scores.length; i++) {
            int kor = scores[i][0];
            int eng = scores[i][1];
            int math = scores[i][2];

            int sum = kor + eng + math;
            double average = sum / scores.length;

            System.out.println(i+1 + "번째 학생 점수 입력 : ");
            System.out.println(" 국어: " + kor + ", 영어: " + eng + ", 수학: " + math);
            System.out.println(" 총점: " + sum + ", 평균: " + String.format("%.2f", average));
            System.out.println();
        }
    }
}
