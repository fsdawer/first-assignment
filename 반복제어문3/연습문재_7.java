package jungol.반복제어문3;

public class 연습문재_7 {
    public static void main(String[] args) {

        int number = 1;
        char letter = 'a';

        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j<=5; j++) {
                if(j <= i) {    // 쉽게 생각해서 letter가 내려갈수록 더 많아지니까 i값은 증가해야함 그니까 i가 클수록
                    System.out.print(letter + " ");
                    letter++;
                } else {
                    System.out.print(number + " ");
                    number++;
                }
            }
            System.out.println();
        }
    }
}
