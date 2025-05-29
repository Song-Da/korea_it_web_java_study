package _28_Static;

public class PrintNum {
    private int num = 10; // 인스턴스 수준 => static 을 붙이면 클래스 수준으로 변함

    public static void printNum() {
//        System.out.println(num); // 클래스 수준
    }
    /*
    num 은 객체가 있어야 하는데, printNum() 은 객체 없이 호출되므로
    num 에 접근할 수 없다.
     */
}
