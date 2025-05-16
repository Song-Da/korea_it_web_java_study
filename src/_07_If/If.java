package _07_If;

public class If {
    public static void main(String[] args) {
        // 조건문 if
        // 키가 120이상이어야 탑승 가능

        int height = 130;
//        if (조건) {
//            조건이 참일 때 실행되는 코드
//        }

        if (height >= 120) { // 실행되어야 하는 코드가 한 줄일 시 중괄호 생략이 가능함.
            System.out.println("탑승 가능");
        } else {
            System.out.println("탑승 불가능");
        }

        // 키가 *120 이상*이고 어른이 *아니면 탑승 가능
        boolean isAdult = false;
        if (height >= 120 && !isAdult) { // 느낌표로 부정을 표시할 수 있음.
            System.out.println("탑승 가능");
        } else {
            System.out.println("탑승 불가능");
        }

        // 키가 *120 이상*이거나 *어른이면 탑승 가능
        if (height >= 120 || isAdult) {
            System.out.println("탑승 가능");
        } else {
            System.out.println("탑승 불가능");
        }
    }
}