package school.lesson7;

import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        File csv = new File("file.scv");
        if (!csv.exists()) {
            csv.createNewFile();
        }
        List<String> stringList = new ArrayList<>();
        stringList.add("Value 1; Value 2; Value 3");
        stringList.add("100; 200; 123");
        stringList.add("300; 400; 500");
        addStringToFile(stringList, csv);
        ArrayList tempo = new ArrayList<>();
        tempo = fromFileToString(csv);
        AppData test = getAppData(tempo);
    }

    // Метод запись данных в файл
    public static void addStringToFile(List<String> stringList, File csv) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(csv))) {
            for (String s : stringList) {
                writer.write(s);
                writer.newLine();
            }
        }
    }

    //Метод чтения из файла и запись в List
    public static ArrayList<String> fromFileToString(File csv) throws IOException {
        BufferedReader csvRead = new BufferedReader(new FileReader(csv));
        ArrayList<String> templist = new ArrayList();
        String line = null;
        while ((line = csvRead.readLine()) != null) {
            templist.add(line);
        }
        return templist;
    }

    // Метод переобразования данных из List-а и запись в обьект Appdata
    public static AppData getAppData(ArrayList<String> stringList) {
        String headersString = stringList.get(0);
        String[] headers = headersString.split(";");
        int[][] data = new int[headers.length][stringList.size() - 1];
        List<String[]> listOfArrays = new ArrayList<>(stringList.size() - 1);
        for (int i = 1; i < stringList.size(); i++) {
            String s = stringList.get(i).trim();
            String[] values = s.split(";");
            listOfArrays.add(values);
        }
        for (int i = 0; i < listOfArrays.size(); i++) {
            String[] values = listOfArrays.get(i);
            for (int j = 0; j < values.length; j++) {
                data[j][i] = Integer.parseInt(values[j].trim());
            }
        }
        return new AppData(headers, data);
    }
}




