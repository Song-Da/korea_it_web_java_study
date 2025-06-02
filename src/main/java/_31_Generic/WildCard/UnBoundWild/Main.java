package _31_Generic.WildCard.UnBoundWild;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello");

        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(1234);

        UnBoundWildcard.printBox(stringBox);
        UnBoundWildcard.printBox(integerBox);
    }
}
