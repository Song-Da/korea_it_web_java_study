package _35_Lambda;

import java.util.Scanner;

/*
    main 에서 정적 메소드로 execute 만들고 매개변수로 String input,
    인터페이스 StringProcessor processor 두가지 받음
    return 으로 processor.process(input);
    스캐너 객체 하나 만들기
    람다식으로 구현 => 모두 대문자로, 모두 소문자로, 접두사로 >> 붙이기, 문자열 거꾸로
    접두사 => ">>" + string, 문자열 거꾸로는 검색해서 찾기
    스캐너로 영문 하나 입력 받고 4가지 실행 결과물 출력
*/
public class StringProcessorMain {
    public static String execute (String input, StringProcessor processor) {
        return processor.process(input);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 >> ");
        String input = sc.nextLine();

        // 람다식 구현
        // 여기는 재정의 하는 구간임. 구현되는 게 아니라!
        StringProcessor toUppercase = s -> s.toUpperCase();
        StringProcessor toLowercase = s -> s.toLowerCase();
        StringProcessor addPrefix = s -> ">>" + s;
        StringProcessor reverse = s -> new StringBuilder(s).reverse().toString();

        System.out.println("원본 문자열 : " + input);
        System.out.println("대문자 변환 : " + execute(input, toUppercase));
        System.out.println("소문자 변환 : " + execute(input, toLowercase));
        System.out.println("접두사 추가 : " + execute(input, addPrefix));
        System.out.println("문자열 거꾸로 : " + execute(input, reverse));
    }
}
