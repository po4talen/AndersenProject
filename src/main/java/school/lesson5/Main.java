package school.lesson5;

public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> forApple = new Box<>();
        forApple.putInBox(apple);
        forApple.putInBox(apple);
        forApple.putInBox(apple);

        Box<Apple> forApple2 = new Box<>();
        forApple2.putInBox(apple);
        forApple2.putInBox(apple);
        forApple2.putInBox(apple);

        Box<Orange> forOrange = new Box<>();
        forOrange.putInBox(orange);

        //forOrange.putInBox(apple);


        System.out.println(forApple.compare(forApple2));
        System.out.println(forApple.compare(forOrange));

        System.out.println(forApple.count);
        System.out.println(forApple2.count);
        forApple.FromSenderBoxToThisBox(forApple2);
        System.out.println(forApple.count);
        System.out.println(forApple2.count);
    }
}