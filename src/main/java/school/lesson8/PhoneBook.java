package school.lesson8;

import java.util.HashMap;
import java.util.Map;

/*Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
 В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
 Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.*/
public class PhoneBook {
    HashMap<Integer, String> list = new HashMap<>();

    PhoneBook() {
    }

    public void add(Integer number, String name) {
        this.list.put(number, name);
        System.out.println("Contact " + name + " with number " + number + " is added");
    }

    public void get(String name) {
        System.out.println("Contact " + name + " has number(s): ");
        for (Map.Entry temp : list.entrySet()) {
            if (name.equals(temp.getValue())) {
                System.out.print(temp.getKey() + "\n");
            }
        }
    }

    public static void main(String[] args) {

        PhoneBook book = new PhoneBook();
        book.add(11111111, "Ivanov");
        book.add(33333333, "Shevchenko");
        book.add(55555555, "Ivanov");
        book.add(66666666, "Sidorov");
        book.get("Ivanov");
    }


}
