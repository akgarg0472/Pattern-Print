package com.akgarg.pepcoding.patterns;

import java.util.Scanner;

public class PatternNine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int space = n - 2;

        for (int i = 1; i <= n; i++) {
            int j = 1;

            // print space before first star
            if (i <= n / 2 + 1) {
                while (j < i) {
                    System.out.print("\t");
                    j++;
                }
            } else {
                while (j <= n - i) {
                    System.out.print("\t");
                    j++;
                }
            }

            // prints first star
            System.out.print("*\t");

            // print space(s) between first and second star
            for (int k = 1; k <= space; k++) {
                System.out.print("\t");
            }

            // prints second star if required
            if (space > 0) {
                System.out.print("*");
            }

            // updates the space count according to requirement
            if (i <= n / 2) {
                space -= 2;
            } else {
                space += 2;
            }

            // moves to next line after each line
            System.out.println();
        }
    }
}
