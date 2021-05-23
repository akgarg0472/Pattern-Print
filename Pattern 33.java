package com.akgarg.pepcoding.patterns;

import java.util.Scanner;

public class PatternTwelve {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 1;

        int[] dpArray = new int[n * n];
        dpArray[1] = 0;
        dpArray[2] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (count < 3) {
                    System.out.print(count - 1 + "\t");
                } else {
                    dpArray[count] = dpArray[count - 1] + dpArray[count - 2];
                    System.out.print(dpArray[count] + "\t");
                }
                count++;
            }

            System.out.println();
        }
    }
}
