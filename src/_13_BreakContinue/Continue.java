package _13_BreakContinue;

public class Continue {
    public static void main(String[] args) {
        // 반복문 - continue
        // continue - 다시 처음으로 돌아감

//        int waiting = 50; // 대기 인원수
//        int max = 20; // 판매 가능 갯수
//        int sold = 0; // 현재 판매량
//        int noShow = 12; // 노쇼 번호

//        for (int i = 1; i <= waiting; i++) {
//            System.out.println(i + "번 손님 입장!");
//            if (i == noShow) {
//                System.out.println(i + "번 손님 노쇼 ㅡㅡ");
//                continue; // 여기를 만난 순간 밑으로 가지 않고 다시 위로 올라감. 이렇게 하면 12번을 뛰어넘겨서 다른 번호에게 판매가 가능함.
//            } // 특정 상황 때문에 바로 밑으로 가면 안 되는 상황에서 쓰는 건 continue.
//
//            sold++;
//            if (sold == max) {
//                System.out.println("재료 소진");
//                break;
//            }
//        }
        int waiting = 50; // 대기 인원수
        int nowNum = 1; // 현재 입장 번호 (시작 번호)
        int max = 20; // 판매 가능 갯수
        int sold = 0; // 현재 판매량
        int noShow = 12; // 노쇼 번호

        while (nowNum <= waiting) {
            System.out.println(nowNum + "번 손님 입장!");

            if (nowNum == noShow) {
                System.out.println(nowNum + "번 손님 노쇼함");
                nowNum++;
                continue;
            }
            sold++; // 판매 처리
            if (sold == max) { // 메뉴가 다 팔렸을 때
                System.out.println("재료 소진");
                break;
            }
            nowNum++;
        }
    }
}