package jungol.배열;

import java.util.Arrays;
import java.util.Scanner;

//public class 배열1_연습문제1_7 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        Integer[] outputArray = new Integer[10];
//
//        for(int i = 0; i< outputArray.length; i++) {
//            outputArray[i] = scanner.nextInt();
//        }
//
//        // 입력받은 수 검사해서 짝수인지 홀수인지 판단
//        Arrays.sort(outputArray);
//
//        int maxIndex = 9;
//        int minIndex = 9;
//
//        int maxEven = outputArray[maxIndex];
//        int minOdd = outputArray[minIndex];
//
//        // 짝수 홀수 저장값중 가장 작은값 출력
//        while (abs(maxEven) % 2 != 0) {
//            maxIndex--;
//            maxIndex = outputArray[maxIndex];
//        }
//
//        while (abs(maxEven % 2 != 1)) {
//            maxIndex++;
//            minOdd = outputArray[minIndex];
//        }
//
//        System.out.printf("%d %d " , minOdd, maxEven);
//    }
//}
