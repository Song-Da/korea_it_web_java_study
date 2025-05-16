package _06_string;

public class EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 (\n, \t, \\ 는 실무에서 쓸 일이 없다. 내용이 있다고만 알아두기.)
        // \n, \t, \\, \", \' 5가지
        System.out.println("집에");
        System.out.println("너무");
        System.out.println("가고 싶다.");

        // \n => new Line : 줄바꿈
        System.out.println("집에\n너무\n가고\n싶다.");

        // \t => tab (스페이스바 4칸)
        /*
            손흥민
            페이커
            방탄소년단
            블랙핑크
         */
        System.out.println("\t손흥민");
        System.out.println("\t페이커");
        System.out.println("\t방탄소년단");
        System.out.println("\t블랙핑크");

        // \\
        // "C:\program Files\java"
        System.out.println("C:\\program Files\\java");

        // \" => 실무에서 종종 쓰임!!
        // 손흥민의 팀은 "토트넘 홋스퍼 FC"이다.
        System.out.println("손흥민의 팀은 \"토트넘 홋스퍼 FC\"이다.");

        // \'
        // 페이커는 '신'이다.
        System.out.println("페이커는 '신'이다."); // 이런 상황에서는 그냥 써도 괜찮지만

        char c = 'A';
        c = '\''; // 이런 상황에서는 역슬래쉬를 써줘야 사용이 가능하다.
        System.out.println(c);

        // 문제
        String id = "990226-4231567";
        // 출력을 990226-1까지만 출력
        System.out.println(id.substring(0,8));
        System.out.println(id.substring(0,id.indexOf("-")+2)); // -까지 나오는데 2를 더해서 뒤에 4까지 나오게 함.
    }
}