package com.akgarg.pepcoding.patterns;

import java.util.Scanner;

public class PatternSixteen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int space = n * 2 - 3;

        for (int i = 1; i <= n; i++) {
            int count = 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + "\t");
            }

            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }

            if (i != n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(--count + "\t");
                }
            } else {
                count--;
                for (int j = 1; j < i; j++) {
                    System.out.print(--count + "\t");
                }
            }

            space -= 2;

            System.out.println();
        }
    }
}
