package seminars.seminar_3.task3;

import java.io.FileNotFoundException;

public class FileNonFound extends FileNotFoundException  {
    public FileNonFound() {
        super("Файл по такому пути не найден");
    }

    public FileNonFound(String s) {
        super("Файл по заданному пути: " + s + " не найден!");
    }
}
