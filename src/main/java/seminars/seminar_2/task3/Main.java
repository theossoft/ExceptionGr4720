package seminars.seminar_2.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String s = "C:\\GB\\ExceptionGr4720\\src\\main\\java\\seminars\\seminar_2\\ReadMe.txt";
        List<String[]> list = readFromFile(s);
        replaceQuestions(list);
        writeToFile(s, list);
    }

    public static List<String[]> readFromFile(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String[]> list = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            list.add(line.split("="));
        }
        return list;
    }

    public static void replaceQuestions(List<String[]> list) {
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i)[1].equals("?") && !isNumber(list.get(i)[1])) {
                throw new RuntimeException("Некорректные данные");
            }
            if (list.get(i)[1].equals("?")) {
                int buf = list.get(i)[0].length();
                String[] r = {list.get(i)[0], String.valueOf(buf)};
                list.set(i, r);
            }
        }
    }

    public static boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void writeToFile(String path, List<String[]> list) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (String[] item : list) {
            bufferedWriter.write(item[0] + " = " + item[1] + "\n");
        }
        bufferedWriter.close();
    }
}
