package com.akgarg.pepcoding.patterns;

import java.util.Scanner;

public class PatternSeventeen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int space = (n >> 1) + 1;

        for (int i = 1; i <= n; i++) {
            if (space != 0) {
                for (int j = 1; j < space; j++) {
                    System.out.print("\t");
                }
                if (i <= (n >> 1) + 1) {
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*\t");
                    }
                } else {
                    for (int k = 1; k <= n - i + 1; k++) {
                        System.out.print("*\t");
                    }
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*\t");
                }
            }


            // updates the spaces to print according to requirements
            if (i == (n >> 1)) {
                space = 0;
            } else {
                space = (n >> 1) + 1;
            }

            // changes to next line after completion of each line
            System.out.println();
        }
    }
}
