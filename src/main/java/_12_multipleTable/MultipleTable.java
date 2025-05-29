package _12_multipleTable;

public class MultipleTable {
    public static void main(String[] args) {
        // 1 ~ 9단까지 출력하기
        // 1 X 3 = 3

        int sum = 0;
        for (int i = 2; i <= 9; i++) { // 앞 단
            for (int j = 1; j <= 9; j++) { // 뒷 단
                sum = i * j;
                System.out.println(i + " X " + j + " = " + sum);
            }
            System.out.println();
        }
    }
}