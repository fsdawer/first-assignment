package day5;

public class Star07 {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {   // 여기서 i는 ++
            for(int j = 5; j >= i; j--) {
                System.out.print("  ");
            }
            for(int k = 1; k <= (i * 2) -1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 5; i >= 1; i--) {   // 여기서 i는 -- 이니까
            for(int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (i * 2) -1; k++) {   // i=5 일떄  k <= 9
                System.out.print("*  ");            // i=4 일떄   k <= 7   i=3일떄  k <= 5 ....
            }
            System.out.println();
        }
    }
}
