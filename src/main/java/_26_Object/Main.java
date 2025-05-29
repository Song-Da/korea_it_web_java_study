package _26_Object;

public class Main {
    public static void main(String[] args) {
        // 모든 클래스는 Object 를 상속받고 있다.
        // 상속 받고 있으니까 Object 가 가진 오버라이드를 쓸 수 있다.
        // 해시코드와 이퀄스는 꼭 세트로 가져와야 한다.

        Teacher teacher1 = new Teacher("이동윤", "코리아IT아카데미");
        Teacher teacher2 = new Teacher("이동윤", "코리아IT아카데미");
        System.out.println(teacher1);
        System.out.println(teacher1.equals(teacher2)); // true 로 성립되려면 hashCode 도 같아야 함.
        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());
        System.out.println(teacher1.equals(teacher2));

    }
}