package _02_dataType;

public class DataTypes {
    public static void main(String[] args) {
        // 문자열, 한 글자를 의미.
        System.out.println("hello");
        // 숫자 정수. 여기서 ""로 감싸면 문자열로 변경됨.
        System.out.println(12345);

        // 변수란 변할 수 있는 수
        // 자료형 변수명 = 데이터;

        // 정수 - int, long
        // 두 개의 차이점은 표현할 수 있는 범위가 다름. long이 int보다 더 저장할 수 있는 범위가 넓음. (byte(크기)가 다름.)
        
        int num = 123; // num 에 123을 넣어둔 상태
        int num1; // num 이라는 변수명만 선언한 상태, 초기화만 한 상태
        num1 = 1234; // 최초값이 초기화가 된 상태.
        num1 = 456; // 이렇게도 가능함. 1234 를 넣었으나 마음이 변해서 456 으로 변경이 가능함. 수정 가능!!
        System.out.println(num);
        System.out.println("num1은 " + num1); // 문자열 추가 가능

        // long을 쓰는 경우가 잘 없긴 함.
        long l = 1_000_000_000_000L; // 가능한 크기를 넘어갈 시 숫자의 마지막에 대문자 L을 써줘야 인식을 함.
        // Tip. _를 사용할 수도 있음!! 값에는 영향을 주지 않고, 코드 가독성을 높일 수 있음.
        System.out.println("l은 " + l);
        
        // 실수 - float, double
        // float 7자릿수, double 14자릿수. 보통 실무에서 double을 많이 쓴다고 함.
        float f = 3.14f; // 소문자 f를 넣어주면 인식이 가능함. 대문자여도 됨.
        double d = 3.141234567891232453;

        // 해당값이 얼마냐에 따라서 자료형을 골라 사용할 수 있어야 함. int, double.

        // 문자 - char
        char a = 'a'; // 문자열은 "", 문자는 '' 를 써야 인식을 함.
        char b = 'b';

        System.out.println("" + a + b); // 문자로 저장을 할 때는 아스키 코드로 인식이 되는 것.
        // 빈 문자열을 적어주면 문자가 문자열로 인식을 해서 ab로 나옴.

        // 문자열 - String
        String str = "안녕하세요."; // 자료형은 아니고 자바 class 로 만들어진 것. 문자열을 만드는 기능을 하는 자바에서 제공을 하는 기능이다.
        System.out.println(str);

        // 논리 자료형 - boolean
        // 참 거짓, true false
        // 조건문과 밀접한 관계를 가지고 있음. 참거짓에 따라서 코드 실행과 미실행이 나눠지기 때문.
        boolean isEmpty;
        isEmpty = true;
        isEmpty = false;

        System.out.println(isEmpty);
        // 실수에서는 부동 소수점의 오류가 있을 수 있다. - 면접 시 질문으로 나올 가능성이 있긴 함.


        /*
        문제1. 제 이름은 *** 입니다. 제 나이는 ** 이고
        취미는 ***입니다.
         */

        String name = "홍길동";
        int age = 22;
        String hobby = "의적질";
        String mbti = "INTJ";

        System.out.println("제 이름은 " + name + "입니다. 제 나이는 " + age + "살이고,");
        System.out.println("취미는 " + hobby + "입니다.");
        System.out.println("제 MBTI는 " + mbti + "입니다.");
    }
}