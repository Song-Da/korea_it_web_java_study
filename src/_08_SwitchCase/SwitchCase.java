package _08_SwitchCase;

public class SwitchCase {
    public static void main(String[] args) {
        // 조건문 - Switch Case
        // 1등 => 전액 장학금
        // 2등 => 반액 장학금
        // 3등 => 반액 장학금
        // 그 이하 => 박수

        // if문은 범위로 된 경우. 크거나 작거나.
        int ranking = 1;
        if (ranking == 1) {
            System.out.println("전액 장학금!!");
        } else if (ranking == 2) {
            System.out.println("반액 장학금!!");
        } else if (ranking == 3) {
            System.out.println("소정의 상품!!");
        } else {
            System.out.println("박수!!");
        }
        System.out.println("수여 끝.");
        System.out.println();

        // switch 는 범위 비교가 안 됨. 나와있는 값이 명확해서 나뉘는 경우.
//        switch (ranking) { // break 를 걸어 주지 않으면 모든 조건이 다 나오기 때문에 각각의 조건의 끝에 걸어 두는 게 좋다.
//            case 1 :
//                System.out.println("전액 장학금");
//                break;
//
//            case 2 :
//                System.out.println("반액 장학금");
//                break;
//
//            case 3 :
//                System.out.println("소정의 상품");
//                break;
//
//            default:    // 마지막인 선택지라 brake는 이미 걸려 있기 때문에 굳이 직접 걸어주지 않는 것.
//                System.out.println("박수!!");
//        }
//        System.out.println("수여 끝!");

        switch (ranking) { // break 를 걸어 주지 않으면 모든 조건이 다 나오기 때문에 각각의 조건의 끝에 걸어 두는 게 좋다.
            case 1 :
                System.out.println("전액 장학금");
                break;

            case 2 : // 같은 출력이 있을 때 앞의 것을 생략하고, 뒤의 것을 살려둬야 한다.
                     // break 가 없으므로 다음 case로 넘어감.
            case 3 :
                System.out.println("반액 장학금");
                break;

            default:    // 마지막인 선택지라 brake는 이미 걸려 있기 때문에 굳이 직접 걸어주지 않는 것.
                System.out.println("박수!!");
        }
        System.out.println("수여 끝!");
        System.out.println();

        int price = 7000;
        int grade = 1; // 수가 정해져 있기 때문에 조건에 들어감
        /*
        1등급이면 만원, 등급이 한단계씩 낮아질수록 -1000
         */

        switch (grade) { // break 가 없을 때 이렇게 만들 수도 있음.
            case 1 :
                price += 1000;

            case 2 :
                price += 1000;

            case 3 :
                price += 1000;
        }
        System.out.println("가격은 " + price);
        System.out.println();

        /*
        봄: 3, 4, 5 => 봄입니다.
        여름: 6, 7, 8 => 여름입니다.
        가을: 9, 10, 11 => 가을입니다.
        겨울: 12, 1, 2 => 겨울입니다
         */

        int month = 2;
        switch (month) {
            case 3 :
            case 4 :
            case 5 :
                System.out.println("봄입니다.");
                break;

            case 6 :
            case 7 :
            case 8 :
                System.out.println("여름입니다.");
                break;

            case 9 :
            case 10 :
            case 11 :
                System.out.println("가을입니다.");
                break;

            case 12 :
            case 1 :
            case 2 :
                System.out.println("겨울입니다.");
                System.out.println();
        }

        /*
        1~7까지 숫자 하나 변수
        월 화 수 목 금 토 일
         */

        int day = 2;
        switch (day) {
            case 1 :
                System.out.println("월");
                break;
            case 2 :
                System.out.println("화");
                break;
            case 3 :
                System.out.println("수");
                break;
            case 4 :
                System.out.println("목");
                break;
            case 5 :
                System.out.println("금");
                break;
            case 6 :
                System.out.println("토");
                break;
            case 7 :
                System.out.println("일");
        }
    }
}