package school.lesson4.catAndDogRunSwim;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.run(400);

        Dog dog = new Dog();

        dog.run(200);
        dog.run(900);
        dog.swim(600);
        dog.swim(10);

        System.out.println(Dog.counterDog);
        System.out.println(Cat.counterCat);
        System.out.println(Animal.counterAnimal);
    }
}
