package homeWork.hw_1.Task_3;

import java.util.Arrays;

class Answer {
    public int[] divArrays(int[] a, int[] b){
        if (a.length != b.length) {
            return new int[]{0};
        }
        int[] c = new  int[a.length];
        for (int i = 0; i < c.length; i++) {
            if(c[i] == 0) throw new RuntimeException();
            c[i] = a[i] / b[i];
        }
        return c;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
class Printer{
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{12, 8, 16};
            b = new int[]{4, 2, 4};
        }
        else{
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Answer ans = new Answer();
        String itresume_res = Arrays.toString(ans.divArrays(a, b));
        System.out.println(itresume_res);
    }
}
