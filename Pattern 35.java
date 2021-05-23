package com.akgarg.pepcoding.patterns;

import java.util.Scanner;

public class PatternTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        while (n > 0) {
            for (int i = 1; i <= n; i++) {
                System.out.print("*\t");
            }
            System.out.println();
            n--;
        }
    }
}
