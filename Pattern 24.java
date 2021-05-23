package com.akgarg.pepcoding.patterns;

import java.util.Scanner;

public class PatternNineteen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1) {
                    if (j == n || j <= (n >> 1) + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else if (i > 1 && i <= (n >> 1)) {
                    if (j == n || j == (n >> 1) + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else if (i == (n >> 1) + 1) {
                    System.out.print("*\t");
                } else if (i > (n >> 1) + 1 && i < n) {
                    if (j == 1 || j == (n >> 1) + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else {
                    if (j == 1 || j >= (n >> 1) + 1) {
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
