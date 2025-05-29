package _27_Bean;

import lombok.*; //.*은 lombok 안에 있는 모든 걸 다 가져왔다는 뜻. 커서를 올리면 다 나옴


@Getter
@Setter
@ToString
//@NoArgsConstructor // <= 기본 생성자까지 하면 Bean이 될 수 있음.
//@AllArgsConstructor
//@RequiredArgsConstructor // 상수 final 을 넣어야 쓸 수 있음, 실무에서 전혀 안 쓰므로 NoArgs, AllArgs 를 잘 씀
public class UserEntityLombok {
    private int userId; // final

    @NonNull // username 은 빈 값이 될 수 없다는 뜻
    private String username;
    private int age;
    private String email;
}
/*
Entity
데이터 베이스의 테이블과 1:1 매핑되는 클래스
자바 객체 <=> DB 테이블 간 데이터를 매핑하기 위해 사용
DB 와 CRUD(생성, 읽기, 추가, 수정) 작업

Lombok
자바의 반복적인 코드를 자동으로 생성해주는 라이브러리(도구 상자)
getter, setter, toString, 생성자, Builder 등등
 */