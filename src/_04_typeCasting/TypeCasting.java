package _04_typeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting

        // 정수에서 실수로
        int scoreInt = 98;
        System.out.println(scoreInt);
        System.out.println((float) scoreInt); // 괄호 안에 실수형을 넣으면 변환됨. 소수점이 부여됨.
        System.out.println((double) scoreInt);
        System.out.println(scoreInt); // 괄호 안에 실수형을 넣어줬기 때문에 변환이 된 것이고(재할당X), 영향받지 않음.

        // 실수에서 정수로
        float scoreFloat = 97.5F;
        System.out.println(scoreFloat);
        System.out.println((int) scoreFloat); // 괄호 안에 정수형을 넣으면 변환됨. 소수점이 버려짐

        double scoreDouble = 88.5;
        System.out.println((int) scoreDouble);

        double sum1 = 98 + 77.3; // 우리 눈에는 안 보이지만 실수형으로 자동 변환됨.
        System.out.println(sum1);

        int sum2 = 98 + (int) 55.3F;
        System.out.println(sum2);

        // 형변환이 자동으로 변환될 때가 있음. 수동으로 해야 할 때도 있음.
        int convertedScoreInt = (int) scoreDouble;
        System.out.println(convertedScoreInt);
        // double -> float -> long -> int ... (수동형변환)

        double convertedScoreDouble = scoreInt; // 변수에 들어가는 자료형이 더 클 때 자동으로 형변환이 된다. 작을 때는 수동으로 형변환을 해줘야 한다.
        System.out.println(convertedScoreDouble);
        // int -> long -> float -> double ... (자동형변환) 갈 수록 더 자세한 수를 표현할 수 있음.

        long scoreLong = 45L;
        convertedScoreInt = (int) scoreLong; // 수동
        System.out.println(convertedScoreInt);

        // 숫자에서 문자열로
        // 정수에서 문자열
        String strNum1 = String.valueOf(55); // 첫번째 방법, 얘의 형태는 String이 맞음. 55로 뜨지만.
        strNum1 = Integer.toString(55); // 두번째 방법
        System.out.println(strNum1);

        // double에서 문자열
        String strNum2 = String.valueOf(88.37); // double 로 바뀌지만 이 형태는 str이 맞다.
        strNum2 = Double.toString(88.37);
        System.out.println(strNum2);

        // float에서 문자열
        String strNum3 = String.valueOf(123.45F);
        strNum3 = Float.toString(123.45F);
        System.out.println(strNum3);

        // 문자열을 숫자로 "123" -> 123
        int i = Integer.parseInt("123");
        System.out.println(i);
        double d = Double.parseDouble("123.45");
        System.out.println(d);

//        i = Integer.parseInt("숫자"); // 에러가 안 뜸. 원래는 떠야 정상임.
//        System.out.println(i);
    }
}