package jungol.반복제어문3;

import java.util.Scanner;

public class 연습문제_5 {
    public static void main(String[] args) {

        int row = 5;

      for(int i = 0; i <= row; i++) {
          for(int j = 0; j <= row-i; j++) {    // i=0 -> j <= 5 (j는 공백 찍는 애니까 공백5칸)
              System.out.print(" ");           // i=2 -> j <= 4 (j는 공백 찍는 애니까 공백4칸)
          }
          for(int k = 1; k <= (2*i) +1; k++) {
              System.out.print("*");
          }
          System.out.println(" ");
      }

    }
}