package Inheritance;

public class RunTest {
    public static void main(String[] args) {
        System.out.println("Parent Class Animal");
        Animal a = new Animal();
        a.eatFood();
        a.runsAround();
        a.huntsForFood();
        a.neverSleeps();

        System.out.println("Child Class Lion");
        Lion L = new Lion();
        L.eatFood();
        L.runsAround();
        L.huntsForFood();
        L.neverSleeps();

        System.out.println("Child Class Tiger");
        Tiger T = new Tiger();
        T.eatFood();
        T.runsAround();
        T.huntsForFood();
        T.neverSleeps();

        System.out.println("Child Class Elephant");
        Elephant E = new Elephant();
        E.eatFood();
        E.runsAround();
        E.huntsForFood();
        E.neverSleeps();

    }
}
