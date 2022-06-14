package school.lesson8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class CountDublicates {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Fox");
        words.add("Dog");
        words.add("Cat");
        words.add("bird");
        words.add("Cat");
        words.add("Human");
        words.add("Fox");
        words.add("Fish");
        words.add("Fish");
        words.add("Fish");
        words.add("Human");

        System.out.println(words);
        System.out.println("Uniq words list: " + foundUniqueWords(words));
        countDublicates(words);
    }


    public  static ArrayList<String> foundUniqueWords(ArrayList<String> list) {
        ArrayList<String> uniqList = new ArrayList<>();
        ArrayList<String> dublicates = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (uniqList.contains(list.get(i))) {
                dublicates.add(list.get(i));
            } else {
                uniqList.add(list.get(i));
            }
        }
        return uniqList;
    }

    public static void countDublicates(ArrayList<String> list){
        Map<String, Integer> words = new HashMap<String, Integer>();
        for (int i = 0; i < list.size(); i++) {
            String tempString = list.get(i);
            if (words.containsKey(tempString)){
                words.put(list.get(i),words.get(tempString)+ 1);
            }
            else {
                words.put(list.get(i), 1);
            }
        }
        for (Map.Entry <String, Integer> temp: words.entrySet() ) {
            System.out.println("Word: " + temp.getKey() + " is listed " + temp.getValue() + " times");
        }


    }
}
