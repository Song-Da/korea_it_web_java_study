package _21_class.Dog;

public class DogMain {
    public static void main(String[] args) {
        // 객체 생성하는 방법
        Dog dog = new Dog(); // 껍데기에 불과한 객체. 아직 이름, 나이 등 내용을 안 넣어줬기 때문.

        // 생성된 해당 객체 속성 값 대입 또는 변경
        dog.name = "방울이"; // 대입
        dog.age = 3;

        dog.name = "호두"; // 변경(수정)

        System.out.println(dog.name);
        System.out.println(dog.age);

        // 생성된 객체 메소드 호출 (그냥 일반 메소드 부르듯이 하면 됨.)
        dog.bark(); // bark 에 Ctrl+클릭 하면 자리로 들어갈 수 있음.
        dog.sleep();

        // Student 라는 패키지 만들고 안에 Student 클래스 파일 만들고 StudentMain 만들기
        // 이름, 나이, 이메일, 주소 변수 만들고
        // 메소드 showInfo() => 정보출력
        // StudentMain 에서 객체 생성 후 정보 대입(주소는 대충)
        // showInfo() 호출해서 정보 출력
    }
}
