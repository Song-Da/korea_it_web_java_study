package _22_inheritance;

public class Main {
    public static void main(String[] args) {
        /*
        상속 - 가족 클래스 (부모 클래스)의 속성과 기능(메소드)을 새로운 클래스(자식 클래스)가 물려받는 것.
        왜 상속을 해야 하나?
        => 코드의 재사용성과 계층 구조 설계를 가능하게 해주는 핵심 개념.
        => 유지 보수 즉, 공통 기능이 한 곳(부모 클래스)에 있으므로, 수정할 일이 생기면 부모 클래스 하나만 고치면 자식 클래스에도 반영이 된다.
        => 기존 클래스를 수정하지 않고도 새로운 기능을 가진 자식 클래스를 추가할 수 있다. (개방 폐쇄 원칙)
        개방 폐쇄 원칙: 확장에는 열려있고, 수정(변경)에는 닫혀있어야 한다. solid 원칙 중 하나임. 4대 원칙을 지키기 위해 있는 것. 알고만 있음 된다.

        자식 클래스는 부모의 코드를 그대로 사용
        자식 클래스는 부모의 코드를 그대로 사용하거나, 필요한 기능을 또 추가하거나
        부모의 코드(메소드)를 변경 가능 => 오버라이딩(★)
         */

        Animal animal1 = new Animal();
        animal1.setAnimalName("고양이");
        animal1.setAnimalAge(3);
        animal1.move();
        System.out.println();

        Tiger tiger1 = new Tiger();
        tiger1.setAnimalName("호랭이");
        System.out.println(tiger1.getAnimalName());
        tiger1.setAnimalAge(3);
        System.out.println(tiger1.getAnimalAge());
        tiger1.move();
        tiger1.hunt();
        tiger1.setStriped(true);
        
        Tiger tiger = new Tiger("백호", 3, false); // 속성 값도 바로 넣을 수 있다
        System.out.println();

        Human human = new Human("홍길동", 22);
        System.out.println(human.getAnimalName());
        System.out.println(human.getAnimalAge());
        human.move();
        human.read("흥부전");
    }
}