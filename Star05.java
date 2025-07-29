package day5;

public class Star05 {
    public static void main(String[] args) {

        for(int i =1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k <= 4-i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
