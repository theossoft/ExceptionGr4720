package seminars.seminar_3.task2;

import java.io.IOException;

public class Counter implements AutoCloseable {
    private Integer count;

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() throws IOException {
        hasClose();
        return count;
    }

    public void add() throws IOException {
        hasClose();
        this.count++;
    }

    @Override
    public void close() throws Exception {
        this.count = null;
    }

    public void hasClose() throws IOException {
        if (count == null) throw new IOException("Экземпляр закрыт");
    }
}
