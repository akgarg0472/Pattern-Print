package com.akgarg.pepcoding.patterns;

import java.util.Scanner;

public class PatternThirteen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(getCij(i, j) + "\t");
            }
            System.out.println();
        }
    }

    private static int getCij(int i, int r) {
        return factorial(i) / (factorial(i - r) * factorial(r));
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
