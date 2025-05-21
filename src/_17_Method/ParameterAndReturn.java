package _17_Method;

public class ParameterAndReturn {
//    public static void power(int number) {
//        // 거듭제곱을 하는 메소드
//        // 매개 변수를 전달 받아서 해당 매개 변수를 거듭제곱
//        // 이 메소드를 쓰려면 int 가 필요하다고 해둠.
//        int result = number * number;
//        System.out.println(number + "의 2승은 " + result + "입니다.");
//    }

    public static int getPower(int number) {
//        int result = number * number;
//        return result;
        return number * number;
    }

//    public static void powerByExp (int number, int exponent) {
//        int result = 1;
//        for (int i = 0; i < exponent; i++) {
//            result *= number;
//        }
//        System.out.println(number + "의 " + exponent + "승은 " + result + "입니다.");
//    }

    public static int getPowerByExp (int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        int power = getPower(3); // return 은 반환값이다. 결과물을 주는 것. 값을 받아올 수 있음.
        System.out.println(power);
        int powerByExp = getPowerByExp(2, 4);
        System.out.println(powerByExp);

        // 문자열을 매개변수로 전달하고 해당 문자열의 길이를 반환받아서 출력하는 메소드
        System.out.println(getStrLength("안녕하세요 반갑습니다."));
    }

    public static int getStrLength (String str) {
        int result = str.length();
        return result;
    }
}