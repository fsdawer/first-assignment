package day5;

public class WhileEx01 {
    public static void main(String[] args) {

        int loop = 1;
        int sum = 0;

        while(loop <= 100) {
            sum += loop;
            loop++;
        }
        System.out.println(sum);
    }
}
