package _28_Static;

public class Counter {
    public static int count = 0;

    public static void increase() {
        count++; // count 라는 객체를 생성하지 않았고, static 이니까 그냥 불러서 사용할 수 있음.
    }

    public static void main(String[] args) {
        increase();
        increase();
        increase();
        System.out.println(count);
    }
}