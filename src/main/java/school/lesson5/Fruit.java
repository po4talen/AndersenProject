package school.lesson5;


import java.util.ArrayList;

abstract class Fruit {
    float fruitWeight;

    Fruit(float weight) {
        this.fruitWeight = weight;
    }

    float getFruitWeight() {
        return this.fruitWeight;
    }
}

class Apple extends Fruit {
    Apple() {
        super(1.0f);
    }

}

class Orange extends Fruit {
    Orange() {
        super(1.5f);
    }
}

class Box<T extends Fruit> {
    ArrayList<T> count = new ArrayList<>();


    void putInBox(T fruit) {
        count.add(fruit);
    }

    float getWeight() {
        float boxWeight = 0;
        for (int i = 0; i < count.size(); i++) {
            boxWeight += count.get(i).getFruitWeight();
        }
        return boxWeight;
    }
//проверить метод компаре и компаре2
    boolean compare(Box <?> b) {
        if (count == b.count) {
            return true;
        } else {
            return false;
        }
    }

    boolean compare2(Box <?> b) {
        if (count.size() == b.count.size()) {
            return true;
        } else {
            return false;
        }
    }

}



