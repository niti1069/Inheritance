package Inheritance;

public class Animal {
    // Methods of the Animal class
    void eatFood() {
        System.out.println("Animal Eats Food");
    }

    void runsAround() {
        System.out.println("Animal Runs Around");
    }

    void huntsForFood() {
        System.out.println("Animal Hunts For Food");
    }

    void neverSleeps() {
        System.out.println("Animal Never Sleeps");
    }

    // The main method (This is the entry point of the program)
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eatFood();
        animal.runsAround();
        animal.huntsForFood();
        animal.neverSleeps();
    }
}
