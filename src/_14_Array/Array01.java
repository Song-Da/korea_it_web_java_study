package _14_Array;

public class Array01 {
    public static void main(String[] args) {
        // 배열 => 같은 자료형의 데이터를 여러 개 저장하는 연속된 공간
        // 고정된 크기

        String country1 = "Hungary";
        String country2 = "Croatia";
        String country3 = "Slovenia";
        String country4 = "Austria";
        String country5 = "Czech";

        // 배열 선언 첫번째 방법 (보통, 일반적인 방법)
//        String[] countries = new String[5];

        // 배열 선언 두번째 방법
//        String countries[] = new String[5];

//        countries[0] = "Hungary"; // 1번째
//        countries[1] = "Croatia"; // 2번째
//        countries[2] = "Slovenia"; // 3번째
//        countries[3] = "Austria"; // 4번째
//        countries[4] = "Czech"; // 5번째
//        countries[5] = "korea";

//        System.out.println(countries[3]);

        // 배열 선언 세번째 방법
//        String[] countries = new String[]
//                {"Hungary", "Croatia", "Slovenia", "Austria", "Czech"};

        // 배열 선언 네번째 방법
        String[] countries = {"Hungary", "Croatia", "Slovenia", "Austria", "Czech"};

        // 배열에서 수정
        countries[1] = "Swiss"; // 대입하듯이 1에다가 스위스를 다시 넣어준 것.
        System.out.println(countries[1]);

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] doubles = {12.34, 23.45, 12.55, 45.78};
        boolean[] booleans = {true, false, false, true};
    }
}