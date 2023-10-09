package seminars.seminar_3.task3;

public class IndexOutOfBounds extends IndexOutOfBoundsException{
    public IndexOutOfBounds() {
        super("Выход за пределы массива!");
    }

    public IndexOutOfBounds(int index) {
        super("Индекса " + index + " в массиве не существует!");
    }
}
