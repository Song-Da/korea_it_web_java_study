package _32_Collections.StrMap;

import java.util.*;

public class StrMap {
    // Map - 키(key) / 값(value)의 쌍으로 이루어진 데이터들의 집합
    // 키는 중복될 수 없다, value 는 중복 가능

    public static void main(String[] args) {
        Map<String, String> strMap1 = new HashMap<>();

        // Map 에 key - value 쌍으로 삽입 -> .put(키, 값)
        strMap1.put("kor2025001", "김준일");
        strMap1.put("kor2025002", "김준이");
        strMap1.put("kor2025003", "김준삼");
        strMap1.put("kor2025004", "김준사");
        strMap1.put("kor2025005", "김준오");

        // 출력
        System.out.println(strMap1);

        // Map 의 순회
        // Map 은 직접적으로 순회할 수 없다 -> 직접 for-each를 돌릴 수 없음
        // 왜냐? 순회하기 위해서는 Interable<?> 인터페이스를 구현한 클래스이거나 배열(T[])것들만 가능
        // collection 은 interable 인터페이스를 상속 받음 (interable은 반복이 가능하게 하는 인터페이스)
        // 근데 Map 은 collection 아님, 그래서 순회 불가
        // 그럼에도 순회하고 싶으면?

        System.out.println(strMap1.entrySet()); // 키, 값 전체를 set 형태로 반환
        System.out.println(strMap1.keySet()); // 키만 set 형태로 반환

        // keySet()을 이용했을 때
        for (String key : strMap1.keySet()) {
            System.out.println("키: " + key + ", 값: " + strMap1.get(key));
        }

        // entrySet() 을 이용했을 때
        for (Map.Entry<String, String> entry : strMap1.entrySet()) {
            System.out.println("키 : " + entry.getKey() + ", 값 : " + entry.getValue());
        }

        // entrySet을 이용하게 되면 키 값 전체 내용이 set 형태로 오는데 keySet 처럼 한가지만 String 으로
        // 들어가는 게 아님 그래서 키 값 형태를 받아줄 수 있는 Map.Entry 에다가 넣어야 함.
        // Map.Entry 는 Map 에 들어가는 데이터의 형식인 키 값 형태인 것임

        // 수정 또는 추가
        strMap1.put("kor2025005", "김준팔");
        // 이미 있는 키라면 값의 수정 발생
        // 없는 키라면 추가 발생

        System.out.println(strMap1);

        // 특정 key 의 value 조회
        System.out.println(strMap1.get("kor2025005"));
        // Map 에는 인덱스가 없다 -> 키로 접근해서 값을 출력 => 순서도 없다

        // 특정 key 의 존재 여부
        boolean isContain1 = strMap1.containsKey("kor2025003");
        System.out.println("kor2025003의 존재 여부 : " + isContain1);

        // 특정 value 의 존재 여부
        boolean isContain2 = strMap1.containsValue("김준일");
        System.out.println("김준일의 존재 여부 : " + isContain2);

        // Map => Set
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>();
        Set<Map.Entry<String, String>> entrySet2 = strMap1.entrySet();
        System.out.println(entrySet2.size()); // 키 값을 하나의 element 로 보고 있다.
        System.out.println(entrySet2);

        // Map => List (set 거쳐서)
        List<Map.Entry<String, String>> entryList1 = new ArrayList<>();
        entryList1.addAll(entrySet2);
        // Map 은 collection 이 아니기 때문에 set 를 거쳐서 넣는다
        System.out.println(entryList1);

        // Map 정렬 => 사실은 불가능
        // Map 은 빠른 탐색 및 검색을 위해서 만들어진(설계된) 형태
        // 정렬은 고려되지 않고 만듦 => 그래서 순서를 보장하지 않음
        // 그럼에도 정렬을 하고 싶다면?
        Collections.sort(entryList1, Map.Entry.comparingByValue()); // 값 기준 정렬
        System.out.println("값 기준 정렬 : " + entryList1);
        Collections.sort(entryList1, Map.Entry.comparingByKey()); // 키 기준 정렬
        System.out.println("키 기준 정렬 : " + entryList1);
        Collections.sort(entryList1, Map.Entry.comparingByKey(Comparator.reverseOrder())); // 키 기준 역순 정렬
        System.out.println("키 기준 역순 정렬 : " + entryList1);

        // Key Set 출력
        Set<String> keySet = strMap1.keySet();
        System.out.println(keySet);
    }
}