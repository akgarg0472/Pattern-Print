package com.akgarg.pepcoding.patterns;

import java.util.Scanner;

public class PatternFifteen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int space = n >> 1;
        int numbers = 1;

        for (int i = 1; i <= n; i++) {
            int j = space + 1;

            // prints the initial spaces
            int sp = space;
            while (sp > 0) {
                System.out.print("\t");
                sp--;
            }

            // prints the number digit as required
            int num = numbers;
            int first;

            if (i <= (n >> 1) + 1) {
                first = i;
            } else {
                first = n - i + 1;
            }

            // prints the all digits required separated by tab
            while (num > 0) {
                if (j <= (n >> 1) + 1) {
                    System.out.print(first + "\t");
                    if (j != (n >> 1) + 1) {
                        first++;
                    } else {
                        first--;
                    }
                } else {
                    System.out.print(first-- + "\t");
                }
                num--;
                j++;
            }

            // updates the value of spaces to print before first number
            // and total count of numbers to print
            if (i <= n >> 1) {
                space--;
                numbers += 2;
            } else {
                space++;
                numbers -= 2;
            }
            System.out.println();
        }
    }
}

