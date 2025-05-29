package _21_class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("홍길동", 22, "Hong@naver.com", "한양 초가집"); // 껍데기
        student.setName("홍동길"); // set을 통해서 수정할 수 있음.

//        student.name = "홍길동";
//        student.age = 22;
//        student.email = "Hong@naver.com";
//        student.address = "한양 초가집";

        System.out.println(student.getEmail());

        student.showInfo();
    }
}