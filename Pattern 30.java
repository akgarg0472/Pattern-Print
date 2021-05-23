package com.akgarg.pepcoding.patterns;

import java.util.Scanner;

public class PatternTen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int startSpace = n / 2;
        int midSpace = 0;

        for (int i = 1; i <= n; i++) {
            // prints the starting spaces
            int j = 1;
            while (j <= startSpace) {
                System.out.print("\t");
                j++;
            }
            if (i <= n / 2) {
                startSpace--;
            } else {
                startSpace++;
            }

            // prints first star
            System.out.print("*\t");

            // prints middle spaces
            int k = midSpace;
            while (k > 0) {
                System.out.print("\t");
                k--;
            }

            // prints last space
            if (i != 1 && i != n) {
                System.out.print("*");
            }

            // update values as required
            if (i <= n / 2) {
                if (midSpace == 0) {
                    midSpace = 1;
                } else {
                    midSpace += 2;
                }
            } else {
                midSpace -= 2;
            }

            // prints to next line after completion of first line
            System.out.println();
        }
    }
}
