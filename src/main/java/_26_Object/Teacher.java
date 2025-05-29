package _26_Object;

import java.util.Objects;

public class Teacher {
    private String name;
    private String schoolName;

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    // name 과 schoolName 의 값을 기반으로 고유한 숫자 (hashCode) 를 생성
    // 쓸 거라면 hashCode 와 equals 는 꼭 둘이 세트로 Override 해줘야 한다.
    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    }

    // equals 에서 같다고 판별한 객체는 같은 해시코드를 가져야 한다, 라고 자바 공식 규칙
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Teacher)) return false;
        Teacher teacher = (Teacher) obj;
        return this.name.equals(teacher.name) && this.schoolName.equals(teacher.schoolName);
    }

    @Override
    public String toString() {
        return name + " 선생님의 근무지는 " + schoolName + "입니다.";
    }
}