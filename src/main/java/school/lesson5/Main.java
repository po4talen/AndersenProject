package school.lesson5;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Orange orange = new Orange();
        Orange orange1 = new Orange();
        Box <Apple> forApple = new Box<>();
        Box <Apple> forApple2 = new Box<>();
        Box <Orange> forOrange = new Box<>();
        forOrange.putInBox(orange);
//        forOrange.putInBox(orange1);
 //       forOrange.putInBox(apple);

        forApple.putInBox(apple);
        forApple.putInBox(apple1);
        forApple.putInBox(apple2);
        forApple2.putInBox(apple);
        forApple2.putInBox(apple1);
        forApple2.putInBox(apple2);

        float a = forApple.getWeight();
        float b = forOrange.getWeight();

        forApple.compare(forOrange);
        forApple.compare(forOrange);
        System.out.println(forApple.compare2(forApple2));


//        forApple.putInBox(orange);

//
       System.out.println(forApple.count);
        System.out.println(a);
        System.out.println(b);
    }
}