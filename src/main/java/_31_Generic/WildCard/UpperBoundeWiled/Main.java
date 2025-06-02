package _31_Generic.WildCard.UpperBoundeWiled;

import _31_Generic.WildCard.UnBoundWild.Box;

public class Main {
    public static void main(String[] args) {
        Box<Dog> dogBox = new Box<>();
        dogBox.setItem(new Dog());

        Box<Cat> catBox = new Box<>();
        catBox.setItem(new Cat());

        Box<Animal> animalBox = new Box<>();
        animalBox.setItem(new Animal());

        ExtendsWild.makeSound(dogBox);
        ExtendsWild.makeSound(catBox);
        ExtendsWild.makeSound(animalBox);
    }
}