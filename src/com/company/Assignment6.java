package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment6 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String text = in.readLine();
        int n = Integer.parseInt(text);
        for (int k = n; k > 0; k--) {
            for (int l = k; l > 1; l--) {
                System.out.print(" ");
            }
            for (int m = (2 * n) + 1; m > 2 * k; m--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k = n; k > 0; k--) {
            for (int l = n+1; l > k; l--) {
                System.out.print(" ");
            }
            for (int m = (2 * k) - 3; m > 0; m -= 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
