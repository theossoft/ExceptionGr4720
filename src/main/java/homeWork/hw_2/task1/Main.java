package homeWork.hw_2.task1;

import java.util.Scanner;

public class Main {
    public static float inputFloatNumber (float in) {
        return in;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        if(!scanner.hasNextFloat()) {
            System.out.println("Введите число с типом float");
        } else {
            System.out.println(inputFloatNumber(scanner.nextFloat()));
        }



    }
}
