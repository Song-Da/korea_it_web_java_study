package _35_Lambda;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

// 람다식 (Lambda Expression)
// Java 8 에서 도입된 '함수형 프로그래밍' 을 지원하기 위한 표현식
// 익명 클래스를 사용해 함수처럼 동작하는 코드
// => 익명 함수
public class Main {
    public static void main(String[] args) {
        // 할 일 목록 만드는 애
        // run() 메소드 밖에 없음
        Runnable jod1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 클래스 방식");
            }
        };
        jod1.run();

        Runnable job2 = () -> System.out.println("람다 방식"); // 소괄호는 이 함수가 매개변수가 있으면 들어감. / (매개변수) -> 실행 구현부;
        job2.run();
        
        // 람다식이 등장한 배경
        // 람다식이 나오기 전에는 함수형 프로그래밍을 하기 위해 익명 클래스를 주로 사용
        // 익명 클래스 방식은 코드가 길어지고, 불필요한 반복이 많아질 수 있었다. => 가독성 저하

        Comparator<Integer> comparator = new Comparator<Integer>() { // compareTo 가 크기를 비교하는 애
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
            // 두 객체 중 만약 앞의 객체가 더 작다면 음수, 같다면 0, 크다면 양수를 반환
        };
        System.out.println(comparator.compare(10, 20)); // 앞의 객체가 작아서 음수가 나옴 -1

        // 이 위는 익명 클래스로 메소드를 사용한 거고 아래는 메소드를 오버라이드 해서 람다식을 사용한 것

        Comparator<Integer> comparator1 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(comparator1.compare(20, 20));

        // ★ 한 줄만 쓸 거면 람다식! 여러 줄로 재정의 할 때는 익명 클래스!

        // 람다식의 장점
        // 코드 간결화
        // 표현력 향상

        // 람다식의 단점
        // 디버깅의 어려움 (디버깅 : 버그, 오류를 잡는다.)
        // 재사용성이 낮음 - 코드가 한줄이 아니고 여러 줄로 늘어났을 때 결국 익명 클래스로 변해서

        // 주요 함수형 인터페이스 - 메소드가 하나만 있는 인터페이스
        // Supplier - T get();
        // 매개변수 없이 값을 반환하는 인터페이스, 단순히 값을 '공급' 하는 역할
        // Consumer - void accept(T t):
        // 값을 매개변수로 받아서 사용하고, 아무것도 반환하지 않는 인터페이스, 데이터를 '소비' 하는 역할 / Supplier 와 반대되는 역할임
        // Function<T, R> - R apply(T t);
        // '하나의 매개변수' 를 받아서, 연산을 수행한 후 결과를 리턴 함
        // T 는 매개변수 타입, R 은 반환 타입
        // Predicate - boolean test(T t);
        // '하나의 매개변수' 를 받아서 특정 조건을 검사한 후 true / false 를 리턴

        // 1. supplier
        Supplier<String> stringSupplier = () -> "Hello, world"; // 반환함
        // 2. consumer
        Consumer<String> stringConsumer = (message) -> System.out.println("메시지 : " + message); // 메소드 안에서 출력하고 반환하지는 않음
        String message = stringSupplier.get();
        stringConsumer.accept(message);
    }

    /*
        익명 클래스 => 즉석에서 해당 클래스나 인터페이스의 메소드를 재정의 해서 사용
        --------- 메소드가 하나일 수도 여러 개일 수도

        ★ 람다식 => 메소드가 하나만 있는 인터페이스를 재정의 해서 사용할 때 표현식 / 어떤 기능을 하는 게 아님!!
        () -> 한 줄 코드;
        () -> {
            여러 줄 코드
        }
     */

}