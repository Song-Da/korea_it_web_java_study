package _31_Generic.WildCard.LowerBoundeWild;

public class Main {
    public static void main(String[] args) {
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Maltese> malteseBox = new Box<>();

        SuperWildCard.putDog(animalBox);
        SuperWildCard.putDog(dogBox);
//        SuperWildCard.putDog(malteseBox);
    }
}
