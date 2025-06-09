package _35_Lambda;

public class CalculatorMain {
    public static int operate(int a, int b, Calculator c) {
        return c.calculator(a, b);
    }

    public static void main(String[] args) {
        Calculator add = (x, y) -> x + y; // add 라는 이름으로 재정의 하고 있음.
        Calculator sub = (x, y) -> x - y;
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> x / y;

        System.out.println("2 + 2 = " + operate(2, 2, add));
        // => (2, 2) -> 2 + 2;
        System.out.println("2 - 3 = " + operate(2, 3, sub));
        System.out.println("2 * 3 = " + operate(2, 3, mul));
        System.out.println("2 / 3 = " + operate(2, 3, div));

        System.out.println();

        // 메소드가 하나여야만 람다식 가능, 메소드가 하나가 아니라 여러 개일 시 익명 클래스를 사용할 수밖에 없음
        // 중괄호로 여러 줄 람다식을 펼칠 수 있는데 왜? 익명 클래스를 사용하는가?
        Calculator div3 = (x, y) -> {
            if (y == 0) {
                System.out.println("0 으로 나눌 수 없습니다.");
                return 0;
            }
            return x / y;
        };
        System.out.println("2 / 0 = " + operate(2, 0, div3));
    }
}