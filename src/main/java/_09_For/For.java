package _09_For;

public class For {
    public static void main(String[] args) {
        // 반복문 - for
        // for (선언; 조건; 증감) {
        //      반복될 코드
        // }

//        for (int i = 0; i < 10; i++) { // i가 0으로 선언. i가 10이 되기 전까지. 즉, 9가 될 때까지 증감이 됨.
//            System.out.println("안녕 " + i);
//        }
//
//        for (int i = 0; i < 50; i++) { // fori 를 치면 자동완성이 됨!! (조건 부분은 비어있음)
//            System.out.println("hi");
//        }

        // 1~10 까지 출력하는데, 짝수만 출력
        // 첫번째 방법, 근데 if 문을 곁들인
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // 두번째 방법, 증감을 건드려서 코드를 줄이는 방법
        for (int i = 2; i <= 10; i+= 2) {
            System.out.println(i);
        }

        // 10부터 1까지 거꾸로 출력 (거꾸로 할 일은 거의 없음.)
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // 문제 => 1부터 100까지 다 더한 값을 출력하세요.
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1~100까지의 합계: " + sum);
    }
}