package _11_nestiedLoop;

public class NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문

        // 네모 별 찍기
        // *****
        // *****
        // *****
        // *****
        // *****

        for (int i = 0; i < 5; i++) { // 세로, 1) 1번째 줄이 시작됨 4) 2번째 줄이 시작됨. 이렇게 5번 반복이 된다.
            for (int j = 0; j < 5; j++) { // 가로, 2) 별이 5개 찍힘
                System.out.print("*");
            }
            System.out.println(); // 3) 5개 찍히고 나서 줄바꿈이 일어남
        }

        System.out.println();

        // 별 삼각형 찍기
        // *
        // **
        // ***
        // ****
        // *****

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) { // i는 j보다 1 커야 함.
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }

        System.out.println();

        // *****
        // ****
        // ***
        // **
        // *

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }

        System.out.println();

        /*
        SSSS* i = 0, j = 4번 j < 4
        SSS** i = 1, j = 3번 j < 3
        SS*** i = 2
        S****
        *****
         */

        for (int i = 0; i < 5; i++) { // 해당 줄의 반복
            for (int j = 0; j < 4 - i; j++) { // S의 반복
                System.out.print("S");
            }
            for (int j = 0; j < i + 1; j++) { // *의 반복
                System.out.print("*");
            }
            System.out.println();
        }
    }
}