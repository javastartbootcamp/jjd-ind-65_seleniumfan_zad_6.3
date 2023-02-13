package pl.javastart.task;

public class ArrayUtils {
    static int[][] createArray(int rowSize, int colSize) {
        int[][] array = new int[rowSize][colSize];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Math.multiplyExact(i, j);
            }
        }
        return array;
    }

    static void showArray(int[][] array) {
        int width = 7 * array[0].length;
        String underscore = "";
        for (int i = 0; i < width; i++) {
            underscore += "_";
        }
        for (int[] row : array) {
            for (int col : row) {
                System.out.printf("%5d |", col);
            }
            System.out.printf("\n%" + width + "s%n", underscore);
        }
    }
}
