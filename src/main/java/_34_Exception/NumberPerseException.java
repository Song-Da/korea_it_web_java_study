package _34_Exception;

import java.util.Scanner;

/*
    1. 사용자로부터 문자열 형태의 입력을 받는다.
    2. 입력된 문자열을 Integer.parseInt() 를 사용하여 정수로 변환한다.
    3. 변환된 숫자를 출력한다.
    4. 만약 변환하는 과정에서 입력값이 숫자가 아니라면 예외 발생 => 예외 처리 후 "숫자가 아닌 값을 입력하였습니다."
     */
public class NumberPerseException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        String input = sc.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("입력한 숫자는 : " + number);
        } catch (NumberFormatException e) {
            System.out.println("숫자가 아닌 값을 입력했습니다.");
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}