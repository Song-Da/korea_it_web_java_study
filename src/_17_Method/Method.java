package _17_Method;

public class Method {
    public static void sayHello() {
        // sayHello 라는 이름을 가진 메소드
        // 안녕을 출력
        System.out.println("안녕");
    }

    public static void main(String[] args) {
        /*
        메소드
        기능을 담당하는 부분
        main 도 실행하는 메소드다. main 바깥에 메소드를 선언.
        코드의 재사용성! 유지 보수를 위해 메소드를 사용함.
         */
        System.out.println("메소드 호출 전");
        sayHello(); // 정의된 메소드를 호출
        System.out.println("메소드 호출 후");
    }
}