package _10_While;

public class DoWhile {
    public static void main(String[] args) {
        // 반복문 - do while (실무에서 자주 쓰지 않음. while 과 차이점은 알아두기.)
        // 일단 한 번 실행 후 조건 검사
        // => 조건에 상관없이 무조건 한 번은 실행.
        /*
        do {
            반복될 코드
        } while (조건);
         */

        // 1~5까지 출력
        int i = 1;
        i = 10;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}
