package com.akgarg.pepcoding.patterns;

import java.util.Scanner;

public class PatternTwenty {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n) {
                    System.out.print("*\t");
                } else {
                    if ((i == j && i > (n >> 1)) || (i == n - j + 1 && i > (n >> 1))) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            }

            System.out.println();
        }
    }
}
