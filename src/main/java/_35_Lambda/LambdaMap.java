package _35_Lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    1. 스캐너 객체 선언, 입력 받아서 저장할 Map 하나 선언(String, Integer)
    2. 상품을 입력할 갯수를 count 로 입력 받기 (nexInt)
    3. count 만큼 반복해서 상품명 (키) 과 가격 (값) 으로 입력 받고 map 에 추가
 */
public class LambdaMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> productMap = new HashMap<>();

        System.out.print("입력할 상품의 갯수를 입력하세요 : ");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("상품명 : ");
            String name = sc.next();

            System.out.print("가격 : ");
            int price = sc.nextInt();
            sc.nextLine();

            productMap.put(name, price);
        }

        System.out.println("[상품 목록]");
        productMap.forEach((name, price) -> System.out.println("상품명 : " + name + ", 가격 : " + price));

    }
}