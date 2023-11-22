package Inheritance;

public class Elephant extends Animal{
    void alwaysSleeps() {

    }

    @Override
    void neverSleeps() {
        super.neverSleeps();
        System.out.println("alwaysleeps");
    }
}
