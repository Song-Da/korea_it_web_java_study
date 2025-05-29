package _10_While;

public class While {
    public static void main(String[] args) {
        // 반복문 - while
        // 조건이 참일 경우 계속 반복
        // while (조건) {
        //      반복할 코드
        // }

        /*
        for문 - 횟수 중심
        while문 - 조건 중심
         */

        // 1~5까지 출력
        int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num++; // 조건을 변화시키기 위한 증가 (필수!!)
        }

        // 10에서 거꾸로 1까지
        num = 10;
        while (num >= 1) {
            System.out.println(num);
            num--;
        }

        // 짝수만 출력 (1~10)
        num = 1;
        while (num <= 10) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++; // if문 안에 들어있으면 겉보기에 while이 적용되지가 않는 것처럼 보이지만, if문 안에서 무한 루프 중임. while 쪽으로 빼내서 증감시켜야 한다.
        }

        // 1 ~ 100까지 누적합
        int sum = 0;
        num = 1;
        while (num <= 100) {
            sum += num;
            num++;
        }
        System.out.println("1~100까지 더한 값: " + sum);
    }
}