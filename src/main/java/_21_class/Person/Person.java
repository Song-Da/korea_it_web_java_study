package _21_class.Person;

public class Person {
    public String name;
    protected int age;
    String address; // 명시를 하지 않았기 때문에 default와 같다.
    private String id;

//    접근제어자 - 하는 이유는 정보 은닉을 위해서.
//    public - 어디서든 접근이 가능 (보통 씀)
//    default - 같은 패키지에서만 접근 가능 (명시를 따로 하지 않으면 default)
//    protected - 같은 패키지 또는 자식 클래스에서만 접근 가능
//    private - 해당 클래스 내부에서만 접근 가능 | 다른 곳에서 접근이 불가능함. (제일 많이 씀)

}