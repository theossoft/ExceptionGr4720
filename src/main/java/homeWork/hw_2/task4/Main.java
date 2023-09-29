package homeWork.hw_2.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String read = null;
        try {
            read = reader.readLine();
            if(read.equals("")) {
                throw new Exception("Пустые строки вводить нельзя");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(read);
    }
}
