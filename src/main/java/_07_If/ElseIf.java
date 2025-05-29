package _07_If;

public class ElseIf {
    public static void main(String[] args) {
        // 다중 조건문
        int avgScore = 88;

        // 90 이상이면 A등급
        // 80 이상이면 B등급
        // 70 이상이면 C등급
        // 나머지는 D등급

        if (avgScore >= 90) {
            System.out.println("A등급");
        } else if (avgScore >= 80) {
            System.out.println("B등급");
        } else if (avgScore >= 70) {
            System.out.println("C등급");
        } else {
            System.out.println("D등급");
        }
        // 앞에 참이 나온 조건이 있으면 뒤에는 다 무시

        // 중첩 if 문
        int age = 19;
        String gender = "여성";
        if (age >= 20) {
            if (gender.equals("여성")) {
                System.out.println("성인 여성입니다.");
            } else {
                System.out.println("성인 남성입니다.");
            }
        } else {
            System.out.println("미성년자입니다.");
        }
    }
}