package _21_class.Person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name); // 어디서든 접근 가능
        System.out.println(person.age); // 같은 패키지라서 접근 가능
        System.out.println(person.address); // 같은 패키지라서 접근 가능
//        System.out.println(person.id); // 같은 패키지 안이라도 다른 클래스이면 접근 불가능

    }
}
