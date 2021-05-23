package com.akgarg.pepcoding.patterns;

import java.util.Scanner;

public class PatternSix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int space = 1;
        int star = n / 2 + 1;

        for (int i = 1; i <= n; i++) {
            int st = star;
            int sp = space * 2 - 1;

            while (st != 0) {
                System.out.print("*\t");
                st--;
            }

            while (sp != 0) {
                System.out.print("\t");
                sp--;
            }

            st = star;
            while (st != 0) {
                System.out.print("*\t");
                st--;
            }

            if (i <= n / 2) {
                star--;
                space++;
            } else {
                star++;
                space--;
            }
            System.out.println();
        }
    }
}
