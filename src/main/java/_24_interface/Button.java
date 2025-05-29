package _24_interface;

// extends => 단일 상속 (클래스, 추상 클래스)
// implements => 다중 상속 (인터페이스)

public abstract class Button implements Press, Up, Down{
    @Override
    public void onDown() {

    }

    @Override
    public abstract void onPressed(); // 무조건 재정의 해준다.

    @Override
    public void onUp() {

    }
}