package _21_class.OOP;

import _21_class.Person.Person; // 다른 패키지라서 임폴트 해온 것.

public class OOP {
    public static void main(String[] args) {
        /*
        OOP => Object Oriented Programing
        객체 지향 프로그래밍
        - 현실 세계의 개념을 코드로 표현
        - 사람, 동물, 자동차 하나의 객체로 보는 것
        - 상태(속성)과 동작(기능)을 중심으로 프로그래밍
        붕어빵을 생각하면 됨. 클래스는 하나의 설계도면, 실체화를 시키기 위한 것.


        OOP의 4가지 원칙         면접 질문으로 자주 나옴!!
        1. 추상화
          - 복잡한 내부 동작은 감추고, 꼭 필요한 기능만 보여주는 것.
        2. 캡슐화
          - 정보 은닉 | 내부 변수에 직접적으로 접근이 불가해짐, 한 번 감싸는 형태
          - 데이터(변수)를 보호하고 접근을 제한하여 안정성을 높이는 것 (정보은닉)
        3. 상속
        4. 다형성
         */

        Person person = new Person();
        System.out.println(person.name); // 어디서든 접근 가능
//        System.out.println(person.age); // 다른 패키지라서 접근 불가능
//        System.out.println(person.address); // 다른 패키지라서 접근 불가능

    }
}