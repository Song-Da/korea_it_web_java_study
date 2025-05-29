package _14_Array;

public class Array02 {
    public static void main(String[] args) {
        // 배열 순회

        String[] countries = {"Hungary", "Croatia", "Slovenia", "Austria", "Czech"};
        // 반복문 for문을 통해 배열 순회
//        for (int i = 0; i < 5; i++) {
//            System.out.println(countries[i]);
//        }

//        for (int i = 0; i < countries.length; i++) { // 변수의 길이를 뽑아오는 length (하수ver.)
//            System.out.println(countries[i]);
//        }

        // enhanced for (for each) 향상된 for문
        for (String country : countries) { // countries(배열, 상자)에 든 걸 country(변수)에 가져다 넣고 출력하는 걸 반복. 실무에서 향상된 for문을 쓰는 게 좋기는 함.
            System.out.println(country);
        }
    }
}