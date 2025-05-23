package _22_inheritance;

/*
    super 는 부모에게 접근할 수 있는 키워드
    자식 클래스에서 "부모님 기능 또는 속성" 접근할 때 쓰는 것
    super 키워드의 두가지 사용 방식
    1. super() : 부모 클래스의 생성자를 호출하는 키워드 / 기본 생성자라면 () 아무런 값이 없다.
        매개변수 생성자라면 () 매개변수가 포함되는 것.
    2.
 */

public class Tiger extends Animal {
    /*
    Animal에게 상속받아 Animal이 가지고 있는 속성과 메소드를 그대로 받음.
    Animal은 부모 클래스(슈퍼 클래스), Tiger는 자식 클래스(서브 클래스)
    이때 부모 클래스에는 없는 속성을 따로 추가할 수 있다.
     */

    private boolean isStriped;

    public Tiger() {
        System.out.println("속성이 정해지지 않은 호랑이 객체 생성");
    }

    public Tiger(String animalName, int animalAge, boolean isStriped) { // All
        super(animalName, animalAge);
        this.isStriped = isStriped;
        System.out.println("모든 속성 값이 부여된 호랑이 객체 생성");
    }

    public boolean isStriped() {
        return isStriped;
    }

    public void setStriped(boolean striped) {
        isStriped = striped;
    }
}
