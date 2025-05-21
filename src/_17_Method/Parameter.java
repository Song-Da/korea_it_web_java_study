package _17_Method;

public class Parameter {
    public static void power(int number) {
        // 거듭제곱을 하는 메소드
        // 매개 변수를 전달 받아서 해당 매개 변수를 거듭제곱
        // 이 메소드를 쓰려면 int 가 필요하다고 해둠.
        int result = number * number;
        System.out.println(number + "의 2승은 " + result + "입니다.");
    }

    public static void powerByExp (int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + exponent + "승은 " + result + "입니다.");
    }

    public static void main(String[] args) {
        /*
        Parameter
        매개 변수, 전달값
         */
        int num = 4;
        power(num);
        power(3);

        powerByExp(2, 4);
        getAvg(80, 90, 100);
        isEven(2);
    }

    // 세개의 정수를 전달하여 평균을 출력하는 메소드
    // getAvg(80, 90, 100);
    static public void getAvg(int num1, int num2, int num3) {
        double result = num1 + num2 + num3;
        double getAvg = result / 3;
        System.out.println(num1 + " + " + num2 + " + " + num3 + " 의 평균은 " + getAvg);
        //  sout ("평균은 " + (a + b + c) / 3);
    }

    // 정수를 전달하여 짝수인지 홀수인지 판별하는 메소드
    // 단 삼항 연산자를 쓸 것
    // isEven(2);
    static public void isEven(int a) {
        System.out.println((a % 2 == 0) ? "짝수" : "홀수");
    }
}