package _25_Casting.Control;

public class Main {
    public static void main(String[] args) {
        /*
        Power 인터페이스
        on(), off() 오버라이드
        Tv, Computer, Speaker, LEDLight, Mouse, SmartPhone
        재정의 하고 각각 고유 메소드 1개
         */

//        Power[] powers = {new Computer(), new Mouse(), new Tv()};
//        CentralControl centralControl = new CentralControl(powers);
        CentralControl centralControl = new CentralControl(new Power[5]);

        centralControl.addDevice(new Computer());
        centralControl.addDevice(new Tv());
        centralControl.addDevice(new Mouse());
        centralControl.addDevice(new Speaker());
        centralControl.addDevice(new LEDLight());
        centralControl.addDevice(new SmartPhone());
        System.out.println();

        centralControl.powerOn();
        centralControl.powerOff();
        System.out.println();

        centralControl.performSpecificMethod();
    }
}