package school.lesson7;

import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        File csv = new File("file.scv");

//        String[] header = new String[]{"value1", "value2", "value3"};
//        int[][] data = new int[2][3];
//        int[][] data2 = {
//                {1, 2, 3},
//                {5, 6, 7}};


        // System.out.println(data1.toString());


//        try (BufferedWriter csvWr = new BufferedWriter(new FileWriter("file.txt"))) {
////            for (String temp: header) {
////                csvWr.write(temp + ";");
////
////            }
//            for (String temp : data1.header) {
//                csvWr.write(temp + ";");
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//


    }
    public static void writeStringToFile(ArrayList<String> stringList, File file) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String s : stringList) {
                writer.write(s);
                writer.newLine();
            }
        }
    }


    public static ArrayList<String> fromFileToString(File csv) throws IOException {
        BufferedReader csvRead = new BufferedReader(new FileReader(csv));
        ArrayList<String> templist = new ArrayList();
        String line = null;
        while ((line = csvRead.readLine()) != null) {
            templist.add(line);
        }
        return templist;
    }

    public static AppData getAppData (ArrayList<String> stringList) {
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




