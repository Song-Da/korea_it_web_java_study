package _06_string;

public class StringCompare {
    public static void main(String[] args) {
        // == 은 궁극적으로 참조 위치가 같으냐고 묻는 것과 같다. equals 는 위치 상관없고 내용만 비교하는 것이다. 둘의 차이점.

        String str1 = "java";
        String str2 = "Python";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2)); // equals 는 == 의 작용을 함.
        System.out.println(str1.equals("java")); // java와 java는 똑같으니까 true가 나옴.
        System.out.println(str2.equalsIgnoreCase("python")); // 대소문자를 구분하지 않고 내용적으로만 비교함.

        String password1 = "1234";
        String password2 = "1234";
        // 1234 가 저장되어 있는 메모리 공간을 password1, password2 가 같은 공간을 참조하고 있다.
        System.out.println(password1 == password2); // 참조 위치 비교
        System.out.println(password1.equals(password2)); // 내용 비교

        password1 = new String("1234");
        password2 = new String("1234");
        // 내용이 같더라도 새로운 메모리 공간을 각각 할당하여 다른 위치에 저장. 각각 참조하고 있음.

        System.out.println(password1 == password2); // 참조 위치가 다름
        System.out.println(password1.equals(password2)); // 하지만 내용은 같다
    }
}