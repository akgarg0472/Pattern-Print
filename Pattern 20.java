package com.akgarg.pepcoding.patterns;

import java.util.Scanner;

public class PatternFive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

//        for (int i = 1; i <= n / 2; i++) {
//            int j = 1;
//            while (j <= n / 2 - i + 1) {
//                System.out.print("\t");
//                j++;
//            }
//
//            while (j <= n / 2 + i) {
//                System.out.print("*\t");
//                j++;
//            }
//            System.out.println();
//        }
//
//        for (int i = n / 2 + 1; i >= 1; i--) {
//            int j = 1;
//
//            while (j <= n / 2 - i + 1) {
//                System.out.print("\t");
//                j++;
//            }
//
//            while (j <= n / 2 + i) {
//                System.out.print("*\t");
//                j++;
//            }
//            System.out.println();
//        }

        // optimized solution
        int space = n / 2;
        int star = 1;

        for (int i = 1; i <= n; i++) {
            int sp = space;
            int st = star;

            while (sp != 0) {
                System.out.print("\t");
                sp--;
            }
            while (st != 0) {
                System.out.print("*\t");
                st--;
            }

            if (i <= n / 2) {
                star += 2;
                space--;
            } else {
                star -= 2;
                space++;
            }
            System.out.println();
        }
    }
}

