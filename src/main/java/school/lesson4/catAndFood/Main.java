package school.lesson4.catAndFood;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(45);
        plate.info();

        Cat array[] = new Cat[5];
        array[0] = new Cat("Black", 10);
        array[1] = new Cat("White", 10);
        array[2] = new Cat("Tima", 10);
        array[3] = new Cat("Red", 10);
        array[4] = new Cat("Yellow", 10);
        plate.addFoodToPlate(plate, 5);

        for (Cat tempArray : array) {
            tempArray.eat(plate);
            System.out.println(tempArray.toString());
        }
    }
}
