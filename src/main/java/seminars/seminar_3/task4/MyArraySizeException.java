package seminars.seminar_3.task4;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException() {
        super();
    }
    public MyArraySizeException(int rows, int columns) {
        super("Размер массива не 4 на 4, а " + rows + " на " + columns);
    }


}
