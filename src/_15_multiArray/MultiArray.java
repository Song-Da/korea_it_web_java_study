package _15_multiArray;

public class MultiArray {
    public static void main(String[] args) {
        // 다차원 배열 (2차원 배열)/코딩 테스트 영역. 실무에서는 잘 안 쓰는 듯.

        // 영화관 좌석
        // A1 ~ A5
        // B1 ~ B5
        // C1 ~ C5
        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        // 3 X 5 (행 X 열)
        // [[], [], []] 배열 안에 배열이 들어있음.
        String[][] seats2 = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        // B3출력
        System.out.println(seats2[1][2]);

        // C4출력
        System.out.println(seats2[2][3]);

        // 첫 줄에 3칸, 두번째 줄에 4칸, 세번째 줄에 5칸
        String[][] seat2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        System.out.println(seats2[1][1]);
    }
}