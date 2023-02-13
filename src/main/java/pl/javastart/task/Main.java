package pl.javastart.task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int row;
        int col;
        boolean isCorrect;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę wierszy tablicy dwuwymiarowej: ");
            row = scanner.nextInt();
            System.out.println("Podaj liczbę kolumn tablicy dwuwymiarowej: ");
            col = scanner.nextInt();
            isCorrect = isNumberOfRowsAndColsInCorrect(row, col);
        } while (!isCorrect);
        int[][] array = ArrayUtils.createArray(row, col);
        ArrayUtils.showArray(array);
    }

    private static boolean isNumberOfRowsAndColsInCorrect(int row, int col) {
        boolean isCorrectRow = row > 0 && row <= 100;
        boolean isCorrectCol = col > 0 && col <= 100;
        if (isCorrectRow && isCorrectCol) {
            return true;
        }
        System.out.println("Podałeś niewłaściwą wartość. Maksymalna ilość to 100x100");
        return false;
    }
}
