package com.akgarg.patterns;

import java.util.Scanner;

public class SamsungPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[][] array = new String[3 * n][2 * n - 1];

        // initializing array with blank spaces
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = " ";
            }
        }
        //
        //
        //
        //
        //
        //
        // first part
        int c1 = array[0].length - 1;
        int cnt1 = 0;
        while (cnt1 < n) {
            for (int i = 0; i <= cnt1; i++) {
                array[cnt1][c1 - i] = "*";
            }
            cnt1++;
        }
        //
        //
        //
        //
        //
        //
        // middle part
        int r21 = n;
        int cnt = 1;
        while (cnt <= n) {
            array[r21++][n - 1] = "|";
            cnt++;
        }
        //
        //
        //
        //
        //
        //
        // third part left side right floyd triangle
        int fCnt = 1;
        while (fCnt < n) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < fCnt; j++) {
                    array[n + fCnt][j] = "*";
                }
            }
            fCnt++;
        }

        // third part right side right floyd triangle
        int rjc = 0;
        for (int i = n; i < array[0].length; i++) {
            for (int j = n + rjc; j < array[0].length; j++) {
                array[i][j] = "*";
            }
            rjc++;
        }

        // third half pipes print
        int r3 = 2 * n;
        int c3 = n;
        for (int i = r3; i < array.length; i++) {
            for (int j = 0; j < c3; j++) {
                array[i][j] = "*";
            }
            c3--;
        }
        //
        //
        //
        //
        //
        //
        // printing pattern
        for (String[] strings : array) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(strings[j] + "\t");
            }
            System.out.println();
        }
    }
}
