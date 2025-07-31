package day07;

public class ArrayExam {
    public static void main(String[] args) {

        char[] apple = {'A', 'P', 'P', 'L' , 'E'};

        for(int i = 0; i < apple.length; i++) {
            apple[i] = Character.toLowerCase(apple[i]);
            System.out.println(apple[i]);
        }
    }
}
