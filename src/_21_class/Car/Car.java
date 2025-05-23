package _21_class.Car;

public class Car { // 자동차에 대한 정의
    String carName;
    int carYearModel;
    String carColor;


    // 생성자
    Car() { // 기본 생성자
        System.out.println("필드가 아무것도 정해지지 않은 껍데기 자동차");
        System.out.println("NoArgsConstructor"); // 스프링 부트할 때 나오는 용어
    } // 아무것도 넣지 않고 출력할 시 이게 나옴.

    Car (String carNm) { // 일반적으로는 매개변수 명과 일치시킴 | 오버로딩이 이루어진 상태임 Car 이 2개인데 매개변수가 달라서! 그렇게 됐다고도 볼 수 있음.
        System.out.println("carName의 속성값이 부여된 자동차");
        System.out.println("RequiredArgsConstructor"); // 선언한 3개 중에 하나라도 있을 때
        this.carName = carNm; // this 는 자기 자신을 의미. 본인이 객체. car2 라고 생각하면 됨. 객체의 속성을 명확히 표현하려고 쓰는 것!!
    } // 이건 이름을 넣으면 생성자가 나옴

    /*
    this 해당 클래스로 만들어진 객체를 의미
    this 를 왜 써야 하는가? => 속성의 이름과 매개변수의 이름이 같을 때 명확히 하기 위해서
    그렇다면 이름이 다르다면 this는 생략 가능
    만약, carName = carName; 이라면 속성에 자기 자신을 대입하는 거라 의미가 없다.
    하지만 this.carName라고 명시를 해두면 속성에 매개변수 값 대입이라는 뜻이 된다.
     */

    Car (String carName, int carYearModel, String carColor) { // 모든 속성값을 다 받겠다는 의미
        System.out.println("모든 속성값이 부여된 자동차");
        System.out.println("AllArgusConstructor");
        this.carName = carName;
        this.carYearModel = carYearModel;
        this.carColor = carColor;
    }


    public void startCar() {
        System.out.println(carName + "이 시동을 겁니다.");
    }

    public void drive() {
        System.out.println(carName + "이 전진합니다.");
    }

    public void stop() {
        System.out.println(carName + "이 정지합니다.");
    }
}