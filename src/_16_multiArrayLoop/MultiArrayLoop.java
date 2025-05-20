package _16_multiArrayLoop;

public class MultiArrayLoop {
    public static void main(String[] args) {
        // 다차원 배열 순회
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"}, // 1,5
                {"B1", "B2", "B3", "B4", "B5"}, // 2,5
                {"C1", "C2", "C3", "C4", "C5"}  // 3,5
        };

        String[][] seat2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // seats[0] => {"A1", "A2", "A3", "A4", "A5"}
        // seats[0].length => 5
        // seats[1] => {"B1", "B2", "B3", "B4", "B5"}
        // seats[1].length => 5

        for (int i = 0; i < seats.length; i++) { // 세로
            for (int j = 0; j < seats[i].length; j++) { // 가로, 해당 배열 안에 든 index 를 뽑으려면  i번째 인덱스 길이를 뽑아옴.
                System.out.print(seats[i][j] + " ");
            }
            System.out.println(); // 줄바꿈
        }

        System.out.println();

        String[][] imaxSeats = new String[10][15]; // 세로, 가로
        String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        for (int i = 0; i < imaxSeats.length; i++) { // 바깥 배열 순회
            for (int j = 0; j < imaxSeats[i].length; j++) { // 안쪽 배열 순회
                imaxSeats[i][j] = eng[i] + (j + 1); // 알파벳[i 세로] + (j 가로 + 1)
            }
        }
        // 출력용
        for (int i = 0; i < imaxSeats.length; i++) {
            for (int j = 0; j < imaxSeats[i].length; j++) {
                System.out.print(imaxSeats[i][j] + " ");
            }
            System.out.println();
        }

        // 다차원 배열 합 구하기
        // 3 x 3 크기 1부터 홀수만 차례대로 대입하고 출력해서 확인
        // 그 수들의 합 구하기
    }
}
