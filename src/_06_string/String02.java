package _06_string;

public class String02 {
    public static void main(String[] args) {
        String str = "I like music and movie and travel.";

        System.out.println(str.replace(" and", ".")); // 특정 문자열을 다른 문자열로 대체
        System.out.println(str.substring(7)); // 인덱스 기준 7부터 출력
        System.out.println(str.substring(7, 12)); // 인덱스 기준 7부터 11까지, 시작은 본인 포함O, 끝 지점은 본인 포함X
        System.out.println(str.indexOf("movie"));
        System.out.println(str.substring(str.indexOf("movie"), str.indexOf("."))); // l까지 출력. 본인 포함을 안 하기 때문에.

        str = "    I want to go home    ";
        System.out.println(str.trim()); // 해당 문자열의 사이 공백X!! 시작할 때 앞, 뒤 공백을 제거함.

        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2)); // 해당 문자열 뒤에 다른 문자열을 이어붙인다.
        System.out.println(s1 + " " + s2);
        System.out.println(s1.concat(" ").concat(s2));
    }
}