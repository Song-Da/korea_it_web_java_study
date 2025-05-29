package _21_class.Car;

public class CarMain {
    public static void main(String[] args) {
        // 같은 클래스로 만들어진 애들이지만 서로서로 다름. 다른 메모리에 존재하고 있으니까.
        // 설계 도면이 같을 뿐 다른 애들임.
        Car car1 = new Car();
        System.out.println();

        Car car2 = new Car("아반떼");
        System.out.println();

        Car car3 = new Car("싼타페", 2025, "white"); // 완전히 다 만들어진 객체

        car3.startCar(); // 클래스를 만들고, 클래스 안에 메소드를 만들어서 메소드를 호출하는 건 안에가 어떻게 돌아가는지 모르니까 추상화.
        car3.drive(); // 어떤 원리로 어떻게 돌아가는지 모르겠으니까 추상화. 말 그대로 복잡한 내부 동작은 모르고 필요한 부분만 보여주는 것.
    }
}