package com.akgarg.pepcoding.patterns;

import java.util.Scanner;

public class PatternSeven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int j = 1;
            while (j < i) {
                System.out.print("\t");
                j++;
            }
            System.out.println("*");
        }
    }
}
