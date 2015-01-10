package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment9 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String text = in.readLine();
        int number = Integer.parseInt(text);
        generate(number);
    }

    private static void generate(int number) {
        int counter = 0;
        if (number == 1 || number == 0) {
            System.out.print("an empty list");
        } else {
            for (int flag = 2; flag <= (number / 2) + 2; flag++) {
                if (number % flag == 0) {
                    for (int prime = 2; prime <= flag / 2; prime++) {
                        if (flag % prime == 0) {
                            counter = 1;
                            break;
                        }
                    }
                    if (counter == 0) {
                        System.out.println(flag);
                    }
                    counter = 0;
                }
            }
        }
    }
}
