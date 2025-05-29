package _28_Static.Person;

public class Person {

    public static int population = 0;
    public String name;

    public Person(String name) {
        System.out.println("현재 인구수 : " + population);
        this.name = name;
        population++; // 멤버 변수라 할 수 없음. 전역 변수(어디든지 다 쓸 수 있는)
        System.out.println("객체가 생성됨");
    }

    public void sayHello() { // 인스턴스 수준 메소드
        System.out.println("안녕하세요, 저는 " + name + "입니다.");
    }

    public static void showPopulation() {
        System.out.println("전체 인구 수 : " + population);
    }

}
