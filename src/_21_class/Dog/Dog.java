package _21_class.Dog;

public class Dog { // 이건 설계도면임. main 은 따로 없음. 여기서 실행하는 게 아님!!
    // 클래스의 필드 => 속성
    // 필드 === 속성 === 멤버변수
    String name;
    int age;

    // 클래스의 메소드 => 기능
    public void bark() {
        System.out.println("왈왈");
    }
    
    public void sleep() {
        System.out.println("잠자기");
    }
}