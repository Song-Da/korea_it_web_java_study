package _22_inheritance;

/*
Animal 상속
부모 생성자 호출해서 객체 생성과 동시에 속성값 넣을 수 있도록 생성자 만들고,
getter setter 만들고
getAnimalName => 오버라이드해서 제 이름은 ___ 입니다. 로 출력
getAnimalAge => 올해 제 나이는 __이고, 내년에는 __입니다.
move => 사람이 두 발로 걷습니다.
고유 메소드 만들기 / read(String bookName) => ___이 책이름을 읽습니다.

Main에서 객체 생성하고 다 써보기
 */
public class Human extends Animal {
    public Human(String animalName, int animalAge) {
        super(animalName, animalAge);
    }
    @Override
    public String getAnimalName() {
        return "제 이름은 " + super.getAnimalName() + "입니다."; // 부모 거를 써야 하니까 super라고 명시를 함.
    }

    @Override
    public int getAnimalAge() {
        System.out.println("올해 제 나이는 " + super.getAnimalAge() + "살이고 내년에는 " + (super.getAnimalAge() + 1) + "살입니다.");
        return super.getAnimalAge();
     }

    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void read(String bookName) {
        System.out.println(super.getAnimalName() + "이 " + bookName + "을 읽습니다.");
    }


    //    public boolean isRead() {
//        return isRead();
//    }
//
//    public void setRead(boolean read) {
//        this.read = read;
//    }
//
//    @Override
//    public void move() {
//        super.move();
//        System.out.println(getAnimalName() + "가 움직입니다.");
//    }
//
//    public void read() {
//        System.out.println(getAnimalName() + "가 책을 읽습니다.");
//    }
}