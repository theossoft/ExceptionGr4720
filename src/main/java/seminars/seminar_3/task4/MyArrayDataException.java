package seminars.seminar_3.task4;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException() {
        super("Не удалось преобразование");
    }
    public MyArrayDataException(int i, int j) {
        super("Не удалось преобразование в ячейке: " + i + "x" + j);
    }
}
