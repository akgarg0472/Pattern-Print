package com.akgarg.pepcoding.patterns;

import java.util.Scanner;

public class PatternEighteen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int space = 0;
        int star = n;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= star; j++) {
                if (i > 1 && i <= (n >> 1) && j > 1 && j < star) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }

            if (i <= (n >> 1)) {
                space++;
                star -= 2;
            } else {
                space--;
                star += 2;
            }

            System.out.println();
        }
    }
}
