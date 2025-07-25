package jungol;

public class 입력_연습문제4 {
    public static void main(String[] args) {

        int a = 5;
        int b = 2;
        int d = 5;
        double c = 3.14;

        double sum1 =  a * b * c;
        double sum2 = a * d * c;

        System.out.println("원주 = " + a + "*" + b + "*" + c + "=");
        System.out.printf("%.4f" , sum1);
        System.out.println(" ");

        System.out.println("넓이 = " + a + "*" + d + "*" + c + "=");
        System.out.printf("%.4f" , sum2);




    }
}
