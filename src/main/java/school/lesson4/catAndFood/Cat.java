package school.lesson4.catAndFood;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            fullness = true;
        } else {
            System.out.println("There is not enough food in plate for cat's fullness");
        }
    }

    public String getName() {
        return name;
    }

    public boolean isFullness() {
        return fullness;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", fullness=" + fullness +
                '}';
    }
}


