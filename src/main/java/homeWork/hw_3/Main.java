package homeWork.hw_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные (в формате: Фамилия Имя Отчество дд.мм.гггг НомерТелефона Пол):");
        String input = scanner.nextLine();

        try {
            UserData userData = parseUserData(input);
            writeUserDataToFile(userData);
            System.out.println("Данные успешно записаны в файл.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка при записи данных в файл:");
            e.printStackTrace();
        }

        scanner.close();
    }

    private static UserData parseUserData(String input) {
        String[] parts = input.split(" ");
        if (parts.length != 5) {
            throw new IllegalArgumentException("Неверное количество параметров.");
        }

        String surname = parts[0];
        String firstName = parts[1];
        String patronymic = parts[2];
        String dateOfBirth = parts[3];
        String phoneNumber = parts[4];
        String gender = parts[5];

        // Проверка форматов данных
        // Можно добавить дополнительные проверки, используя регулярные выражения

        return new UserData(surname, firstName, patronymic, dateOfBirth, phoneNumber, gender);
    }

    private static void writeUserDataToFile(UserData userData) throws IOException {
        String filename = userData.getSurname() + ".txt";
        FileWriter writer = new FileWriter(filename, true); // Добавление к файлу, если он уже существует

        writer.write(userData.toString());
        writer.write(System.lineSeparator()); // Добавление перевода строки

        writer.close();
    }
}

