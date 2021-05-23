package com.akgarg.pepcoding.patterns;

import java.util.Scanner;

public class PatternFour {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                while (j < i) {
                    System.out.print("\t");
                    j++;
                }
                while (j<=n) {
                    System.out.print("*\t");
                    j++;
                }
            }
            System.out.println();
        }
    }
}
