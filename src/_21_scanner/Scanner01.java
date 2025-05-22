package _21_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // Scanner => 입력
        Scanner sc = new Scanner(System.in); // Scanner 또한 하나의 class임
        // String 문자열을 입력받기
        // next() = 토큰 단위로 읽는다.
        // 토큰 : 공백 문자(띄어쓰기, 탭, 엔터) ex: 안녕하세요. 반갑습니다 => 안녕하세요. 까지 인식
        // nextLine() => 엔터가 입력될 때까지 ex: 안녕하세요 .반갑습니다. => 반갑습니다. 까지 인식

//        String str1 = sc.next();
//        String str2 = sc.next();
//        System.out.println("str1은 " + str1);
//        System.out.println("str2은 " + str2);

//        String str3 = sc.nextLine();
//        System.out.println("str3은 " + str3);

        // int 정수 입력받기
        // nextInt()
//        int num1 = sc.nextInt(); // 토큰 단위로 읽음. next 와 동일
//        int num2 = sc.nextInt();
//        System.out.println("num1은 " + num1);
//        System.out.println("num2은 " + num2);

        // 골 때리는 경우
//        int num = sc.nextInt(); // 123\n => 123
//        sc.nextLine(); // 일종의 배리어 역할. \n 을 버려주기 위한 역할.
//        String str = sc.nextLine(); // \n
//        System.out.println("num은 " + num + ", str은 " + str);

        /*
        나이와 이름을 입력 받으세요.
         */

        int age = sc.nextInt();
//        sc.nextLine();
        String name = sc.nextLine();
//        System.out.println("나이: " + age + "세, 이름: " + name);

        System.out.println("나이를 입력해주세요 >>");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("이름을 입력해주세요 >>");
        name = sc.nextLine();
        System.out.println("나이는 " + age + ", 이름은 " + name);
    }
}