package _06_string;

public class String01 {
    public static void main(String[] args) {
        String str = "My name is DongYoon Lee";

        System.out.println(str.length()); // 문자열 길이를 세어줌.

        System.out.println(str.toUpperCase()); // 싹 다 대문자로 만들어서 출력해줌
        System.out.println(str.toLowerCase()); // 싹 다 소문자로 만들어서 출력해줌

        System.out.println(str.contains("name")); // 해당 문자열에 포함 여부를 묻는 것, 결과는 boolean
        System.out.println(str.contains("age"));

        System.out.println(str.indexOf("name")); // 해당 위치 정보. 4가 나와야 하지만 3이 나옴. >>컴퓨터는 1이 아니라 0부터 세기 때문이다<<
        System.out.println(str.indexOf("age")); // 만약 없으면 -1 을 출력한다.

        str = "I like music and movie and travel";
        System.out.println(str.lastIndexOf("and")); // 둘 중에 마지막에 있는 and 의 위치를 찾아서 알려줌.
        System.out.println(str.lastIndexOf("java")); // 만약 없으면 -1 을 출력한다.
        System.out.println(str.startsWith("I")); // 해당 문자열로 시작하냐? => boolean
        System.out.println(str.startsWith("My name"));
        System.out.println(str.endsWith("travel")); // 해당 문자열로 끝나냐? => boolean
        System.out.println(str.endsWith("movie"));


    }
}