package _23_Abstraction;

/*
Factory라는 추상 클래스 상속
생성자 만들어서 이름 바로 넣도록
재정의 다 해주고
고유 메소드 upgrade(String model) => "아이패드 7세대로 업그레이드 되었습니다."
메인에서 produce("아이패드 6세대")
upgrade("아이패드 7세대")
 */

public class TabletFactory extends Factory {
    public TabletFactory(String name) {
        super(name);
    }

    @Override
    public void produce(String model) {
        System.out.println("[" + model + "] 태블릿을 생산합니다.");
    }

    @Override
    public void manage() {
        System.out.println(getName() + " 공장을 관리합니다.");
    }

    public void upgrade(String model) { // 고유 메소드이기 때문에 오버라이드X
        System.out.println(model + "로 업그레이드 되었습니다.");
    }
}
