package com.akgarg.pepcoding.patterns;

import java.util.Scanner;

public class PatternEleven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int number = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number++ + "\t");
            }
            System.out.println();
        }
    }
}
