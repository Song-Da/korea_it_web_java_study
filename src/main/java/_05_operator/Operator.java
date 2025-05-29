package _05_operator;

public class Operator {
    public static void main(String[] args) {
        // 연산자

        // 대입 연산자
        int num1 = 10; // int 형태를 변수에다가 10을 대입함.
        int num2 = 5;
//        // 여기서 = 은 해당 변수에 데이터(값)을 대입한다는 의미
//        // 수학적인 같다 라는 의미가 아님.
//
//        // 산술 연산자
//        System.out.println(num1 + num2);
//        System.out.println(num1 - num2);
//        System.out.println(num1 * num2); // 곱하기
//        System.out.println(num1 / num2); // 몫을 출력함
//        System.out.println(num1 % num2); // 나눈 나머지를 출력함
//
//        // 복합 대입 연산자
//        num1 += 5; // num1 = num1 + 5 과 같은 의미이다. num1 에다가 5를 더하는 것.
//        System.out.println(num1); // => 15
//        num1 -= 5; // num1 = num1 - 5 와 같은 의미이다. num1 에다가 5를 빼는 것.
//        System.out.println(num1); // => 10
//        num1 *= 2; // num1 = num1 * 2 와 같은 의미이다. num1 에다가 2를 곱하는 것.
//        System.out.println(num1); // => 20
//        num1 /= 2; // num1 = num1 / 2 와 같은 의미이다. num1 에다가 2로 나누는 것.
//        System.out.println(num1); // => 10
//        // / 는 몫의 값이고 % 는 나머지 값
//        num1 %= 2; // num1 = num1 % 2 와 같은 의미이다. num1 에다가 2로 나누어 나머지를 구하는 것.
//        System.out.println(num1);

        // 증감 연산자
        int j = 10;
//        System.out.println(j);
        // 실행이 된 후에 1 증가
//        System.out.println(j++); // 코드를 한 번 실행하고 나서 증감이 되는 거임. 10 => 10 + 1
//        System.out.println(j); // 여기서부터 1이 추가된 채로 나옴
        // 실행이 된 후에 1 감소
//        System.out.println(j--); //
//        System.out.println(j);
        // 실행이 되기 전에 1 증가
//        System.out.println(++j); // 이 줄이 실행되기 이전에 j 에다가 이미 +1을 추가한 상태
//        // 실행이 되기 전에 1 감소
//        System.out.println(--j); // 이 줄로 오자마자 j 에다가 -1을 한 상태로 출력이 됨.

        // 비교 연산자 => 결과가 항상 boolean 참/거짓 둘 중 하나로만 결과가 나오는 것
        num1 = 5;
        num2 = 3;
        System.out.println(num1 > num2); // num1 이 num2 보다 크기 때문에 true
        System.out.println(num1 >= num2); // num1 이 num2 보다 크거나 같기 때문에 true
        System.out.println(num1 < num2); // num1 이 num2 보다 작기 때문에 false
        System.out.println(num1 <= num2); // num1 이 num2 보다 작거나 같기 때문에 false
        System.out.println(num1 == num2); // 같냐?
        System.out.println(num1 != num2); // 같지 않나?

        // 논리 연산자 (&(and), |(or), !(부정))
        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println(flag1 & flag2); // & and 논리곱 => 하나라도 false 가 있으면 false
        System.out.println(flag1 | flag2); // | or 논리합 => 하나라도 true 가 있으면 true
        System.out.println(flag2 | flag2); //
        System.out.println(!flag1);

        // 논리 연산자 조합 (&&, ||)
        // && => 선조건이 true일 때만 후조건을 실행한다. 선조건이 혹시라도 false 이면 후조건을 실행하지 않는다. 둘 다 true 이어야 함.
        // || => 선조건이 true 이면 후조건을 실행하지 않는다. 선조건이 false 일 때만 후조건을 실행한다. 둘 중에 하나라도 true 면 됨.
        System.out.println(flag1 && flag2);
        System.out.println(flag1 || flag2); // 만약 선조건이 false 이고 후조건이 true 일 시 후조건을 실행시킴.

        // 삼항 연산자 (제법 많이 쓰는 형태임. 개발자는 게으르다.)
        // () 는 조건, ? 는 물어보는 것. x가 y보다 크면 true인 x 가 max 에 대입이 된다.
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
        System.out.println(max);

        int min = (x < y) ? x : y;
        System.out.println(min);

        x = 3;
        boolean isSame = (x == y) ? true : false;
        System.out.println(isSame);

        String sameStr = (x != y) ? "다름" : "같음"; // 현재 x, y 가 3이니까 같다고 나옴.
        System.out.println(sameStr);

        /*
        int 로 height = 숫자;
        키가 120 이상인 경우 탑승 가능하도록 하는 삼항연산자
        가능하면 "탑승 가능" 불가능하면 "탑승 불가능" 출력
         */

        // 막히면 부등호를 다시 반대로 집어넣어 보기.
        int height1 = 130;
        String result = (height1 >= 120) ? "탑승 가능" : "탑승 불가능";
        System.out.println(result);
    }
}