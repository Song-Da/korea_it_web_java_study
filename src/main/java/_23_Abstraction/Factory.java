package _23_Abstraction;

/*
abstract => 추상적인, 형태만 있는
틀은 있지만 내용은 없는 클래스, 틀만 제공함
이 기능은 꼭 있어야 해! 근데 이 기능 구현은 자식 클래스에서 해!
객체는 만들 수 없다.
왜 써야 하는가?
설계 일관성과 확장성 확보 => 공통된 구조를 가진 자식 클래스들을 설계
오류 방지 / 강제 구현 => 추상 메소드를 구현하지 않으면 에러가 발생 (필수 기능 구현 누락 방지)
코드 재사용성 => 공통 메소드나 필드를 추상 클래스에 미리 작성 가능
 */
public abstract class Factory {
    private String name;

    public Factory(String name) {
        this.name = name;
    }

    // 추상 클래스의 추상 메소드
    public abstract void produce(String model); // 중괄호 열고 더 구현을 하는 게 맞지만 추상 클래스는 그러지 않음.
    public abstract void manage();
    // 추상 클래스 => 추상 메소드가 하나라도 있으면 추상 클래스

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("공장 정보를 출력합니다. 공장 이름: " + name);
    }
}