package jungol.반복제어문3;

import java.util.Scanner;

public class 연습문제_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("자연수를 입력하세요 : ");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = n; j > 0; j--) {
                if(i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}

//     *   if(i < j) - > i가 1 j가 5이면 1,2,3,4 > 5니까 4칸 띄워야함
//    **   if(i < j) - > i가 2 j가 5이면 1,2,3 > 5니까 3칸 띄워야함
//   ***   if(i < j) - > i가 3 j가 5이면 1,2 > 5니까 2칸 띄워야함
//  ****
// *****