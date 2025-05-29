package _28_Static.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("홍길동");
        Person person2 = new Person("김춘향");

        person1.sayHello(); // 인스턴스 메소드
        person2.sayHello();

        Person.showPopulation(); // 클래스 메소드 (static)
        // static 이 있으면 객체 생성 없이 클래스로 바로 접근이 가능하다!! 없을 시 객체를 만들어 줘야 한다.
    }
}