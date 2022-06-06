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


 // Не забываем про метод добавления фрукта в коробку.
    void putInBox(T fruit) {
        count.add(fruit);
    }

    //Сделать метод getWeight(), который высчитывает вес коробки,
    float getBoxWeight() {
            float boxWeight = 0;
            for (int i = 0; i < count.size(); i++) {
            boxWeight += count.get(i).getFruitWeight();
        }
        return boxWeight;
    }

    /*Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра.
     true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;*/
    boolean compare(Box<?> b) {
        if (this.getBoxWeight() == (b.getBoxWeight())) {
            return true;
        } else {
            return false;
        }
    }

    /* Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;*/
    void FromSenderBoxToThisBox(Box<T> senderBox) {
        this.count.addAll(senderBox.count);
        senderBox.count.clear();
    }
}



