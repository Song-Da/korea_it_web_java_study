package _29_Builder;

public class MemberMain {
    public static void main(String[] args) { // 객체.메소드.메소드.메소드가 메소드 체이닝임 한꺼번에 호출이 가능함
        // 만약 생성자로 만들어서 줄 때는 순서를 맞춰야 함. 매개 변수가 뭐뭐 있는지 다 기억하고 알맞게 넣어야 한다는 단점.
        // 근데 Builder 메소드 체이닝은 그럴 필요가 없고 순서를 섞어도 상관이 없다는 이점이 있음.
        Member member = new Member.Builder()
                .name("홍길동")
                .age(27)
                .email("hong@naver.com")
                .build();
    }
    // 빌더 방식을 이용했을 때의 이점
    // 1. 가독성이 높아진다.
    // 2. 매개 변수의 순서를 지키지 않아도 된다.
    // 3. 유지 보수성이 향상된다. => 필드 추가, 변경에 용이하다.
}
