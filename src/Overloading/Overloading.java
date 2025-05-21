package Overloading;

public class Overloading {
    public static int getPower(int number) {
        return number * number;
    }

    public static int getPower(double doubleNum) {
        int number = (int) doubleNum;
        return number * number;
    }

    public static int getPower(String strNum) {
        int number = Integer.parseInt(strNum);
        return number * number;
    }

    public static int getPower (int number, int exponent) { // 얘는 매개변수가 2개라서 오버로딩이 가능함 다른 애들은 1개의 매개변수였지만 자료형이 달랐음.
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        /*
        메소드 오버로딩
        같은 이름의 메소드를 여러 개 선언 (자료형이 달라야 한다.)
        매개변수(파라미터)의 타입이 달라야 한다. 또는 갯수가 달라야 한다.
        리턴 자료형은 같아야 한다.
         */
        System.out.println(getPower(3));
        System.out.println(getPower(2.3));
        System.out.println(getPower("4"));
        System.out.println(getPower(2, 4));

        /*
        문제
        메소드 이름은 printInfo()
        1. 문자열 이름만 전달 => 이름을 출력
        2. 문자열 이름, 정수 나이 2가지 전달 => 이름 나이 출력
        3. 문자열 이름, 정수 나이, 문자열 이메일 => 이름 나이 이메일 출력
        void 를 사용, 반환은 따로 없이 메소드 안에서 출력
         */

        /*
        문제
        메소드 이름은 add() => void
        1. int 와 int 의 덧셈 (매개변수 2개)
        2. double 과 double 덧셈 (매개변수 2개)
        3. 문자열 숫자와 문자열 숫자의 덧셈 (문자열 2개, 형변환)
         */

        printInfo("홍길동");
        printInfo("홍길동", 22);
        printInfo("홍길동", 22, "길동@naver.com");

        add(1, 2);
        add(2.4, 5.6);
        add("1", "3");
    }

    public static void printInfo (String name) { // 반환을 할 때는 sout 을 main 에 넣어줘야 한다. 하지만 void 에서는 이미 안에서 sout 이 들어가 출력이 되어 있으므로 그냥 main 에서는 부르기만 하면 됨.
        System.out.println("이름: " + name);
    }

    public static void printInfo (String name, int age) {
        System.out.println("이름: " + name + ", 나이: "+ age);
    }

    public static void printInfo (String name, int age, String email) {
        System.out.println("이름: " + name + ", 나이: " + age + ", email: " + email);
    }


    public static void add(int a, int b) {
        System.out.println(a);
        System.out.println(a + b);
    }

    public static void add(double a, double b) {
        System.out.println(a);
        System.out.println(a + b);
    }

    public static void add(String a, String b) {
        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);
        System.out.println(a);
        System.out.println(a + b);
    }
}