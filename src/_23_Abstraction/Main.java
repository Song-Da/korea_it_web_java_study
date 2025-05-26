package _23_Abstraction;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory("애플");
        phoneFactory.setName("삼성");
        phoneFactory.produce("아이폰16");
        phoneFactory.manage();
        phoneFactory.displayInfo();

        Factory factory = new Factory("애플") { // 잠깐 자식 클래스를 만들고 자식 클래스의 객체를 만듦. 팩토리의 객체는 아님. 즉석에서 구현해서 잠깐씩 쓸 수 있는 것.
            @Override
            public void produce(String model) {
                System.out.println(getName() + "잠깐 만들어진 익명 클래스가 무언가를 생산합니다.");
            }

            @Override
            public void manage() {
                System.out.println(getName() + "잠깐 만들어진 익명 클래스가 공장을 관리합니다.");
            }
        };
        factory.manage();
        factory.produce("스마트폰");
        System.out.println();
        /*
        익명 클래스 => 추상 클래스의 객체처럼 보이지만 자식 클래스를 즉석에서 임시로 만들어서 객체를 만들어낸 것.
        재사용 하지 않고 한 번만 쓰고 버릴 거라면 익명 클래스를 사용.
        즉, 임시로 만들어진 이름 없는 자식 클래스 == 익명 클래스
        그러므로 추상 클래스의 객체가 만들어진 것이 아니기 때문에 추상 클래스의 개념에 위배 되는 것은 아니다.
        엄청 중요하지는 않지만 알아는 두기.
         */

        TabletFactory tabletFactory = new TabletFactory("apple");
        tabletFactory.produce("아이패드 6세대");
        tabletFactory.upgrade("아이패드 7세대");
    }
}