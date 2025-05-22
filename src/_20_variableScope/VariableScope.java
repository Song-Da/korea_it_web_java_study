package _20_variableScope;

public class VariableScope {
    public static void method() {
        String str = "abc"; // method 안에서만 쓸 수 있는 지역 변수
//        System.out.println(name);
    }

    public static void main(String[] args) {
        String name = "홍길동"; // main 안에서만 쓸 수 있는 지역 변수
//        System.out.println(str);

        for (int i = 0; i < 10; i++) { // 중괄호 밖을 나가게 되면 쓸 수 없는 지역 변수
            System.out.println(i);

            int age = 27;
        }
//        System.out.println(i);
//        System.out.println(age);
    }
}