package seminars.seminar_3.task1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            soSomething();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void soSomething() throws IOException {
    }
}
