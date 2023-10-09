package seminars.seminar_3.task3;

public class DivisionByZeroException extends ArithmeticException{
    public DivisionByZeroException() {
        super("Деление на ноль запрещено!");
    }
}
