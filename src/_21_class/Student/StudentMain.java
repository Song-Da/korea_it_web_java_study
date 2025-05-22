package _21_class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student(); // 껍데기

        student.name = "홍길동";
        student.age = 22;
        student.email = "Hong@naver.com";
        student.address = "한양 초가집";

        student.showInfo();
    }
}