package school.lesson4.catAndDogRunSwim;

public class Cat extends Animal {
    public final int RUN_METERS = 200;
    public static int counterCat;

    {
        ++counterCat;
        ++Animal.counterAnimal;
    }

    @Override
    public void run(int distance) {

        if (distance > RUN_METERS) {
            System.out.println("Cat " + "has run only " + RUN_METERS + " meters from distance " + distance);
        } else {
            System.out.println("Cat " + "has run " + distance + " meters");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat can't swim");
    }
}
