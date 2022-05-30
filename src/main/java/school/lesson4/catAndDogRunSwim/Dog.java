package school.lesson4.catAndDogRunSwim;

public class Dog extends Animal {
    public final int RUN_METERS = 500;
    public final int SWIM_METERS = 10;
    public static int counterDog;

    {
        ++counterDog;
        ++Animal.counterAnimal;
    }

    @Override
    public void run(int distance) {

        if (distance > RUN_METERS) {
            System.out.println("Dog " + "has run only " + RUN_METERS + " meters from distance " + distance);
        } else {
            System.out.println("Dog " + "has run " + distance + " meters");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > SWIM_METERS) {
            System.out.println("Dog " + "has swim only " + SWIM_METERS + " meters from distance " + distance);
        } else {
            System.out.println("Dog " + "has swim " + distance + " meters");
        }
    }
}
