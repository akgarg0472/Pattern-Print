package com.akgarg.patterns;

import java.util.Scanner;

public class ConcentricSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int size = 2 * n - 1;
        int[][] array = new int[size][size];

        int minRow = 0;
        int minCol = 0;
        int maxRow = array.length - 1;
        int maxCol = array[0].length - 1;

        while (n > 0) {
            for (int i = minRow; i <= maxRow; i++) {
                array[i][minCol] = n;
            }
            minCol++;

            for (int i = minCol; i <= maxCol; i++) {
                array[maxRow][i] = n;
            }
            maxRow--;

            for (int i = maxCol; i >= minRow; i--) {
                array[i][maxCol] = n;
            }
            maxCol--;

            for (int i = maxCol; i >= minCol; i--) {
                array[minRow][i] = n;
            }
            minRow++;

            // reducing number to print
            n--;
        }

        for (int[] i : array) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(i[j] + "\t");
            }
            System.out.println();
        }
    }
}
