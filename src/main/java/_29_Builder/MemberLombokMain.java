package _29_Builder;

public class MemberLombokMain {
    public static void main(String[] args) {
        MemderLombok memderLombok = MemderLombok.builder()
                .age(22)
                .email("hong@naver.com")
                .name("홍길동")
                .build();
    }
}
