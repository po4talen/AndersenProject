package school.lesson4.catAndFood;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void decreaseFood(int n) {
        if ((food - n) >= 0) {
            food -= n;
        } else {
            System.out.println("Plate can't have negative value");
        }
    }

    public void addFoodToPlate(Plate p, int add) {
        this.food += add;
    }

    public int getFood() {
        return food;
    }

}