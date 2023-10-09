package seminars.seminar_3.task4;

import javax.print.DocFlavor;

public class Main {
    public static void main(String[] args) {
        String[][] matrix = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        try {
            System.out.println(matrixSum(matrix));
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e.getMessage());
        }

    }

    public static int matrixSum(String[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != 4 || matrix.length != 4) {
                throw new MyArraySizeException(matrix.length, matrix[i].length);
            }
            for (int j = 0; j < matrix.length; j++) {
                try {
                    sum += Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }

}
