package _31_Generic.WildCard.LowerBoundeWild;

public class SuperWildCard {
    // 하한 경계 와일드 카드 : Dog 또는 Dog 의 상위 타입만 허용
    public static void putDog(Box<? super Dog> box) {
        box.setItem(new Dog()); // 쓰기는 가능
//        Dog dog = box.getItem(); // 읽기 불가능

        Object obj = box.getItem(); // 읽을 수는 있으나 object 로 반환됨

        System.out.println("obj: " + obj);
    }
}