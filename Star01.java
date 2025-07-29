package day5;

public class Star01 {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println(" ");  // 줄바꿈 꼭 신경쓰기
        }
    }
}
