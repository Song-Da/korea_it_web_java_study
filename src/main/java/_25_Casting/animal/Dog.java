package _25_Casting.animal;

public class Dog extends Animal {

    @Override
    public void speak() {
        System.out.println("멍멍");
    }

    public void wagTail() {
        System.out.println("꼬리를 흔든다.");
    }
}