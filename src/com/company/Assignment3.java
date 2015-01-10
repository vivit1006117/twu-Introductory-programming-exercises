package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment3 {

    public static void main(String[] args) throws IOException {
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        String text= in.readLine();
        int n= Integer.parseInt(text);
        for(;n>0;n--)
        {
            System.out.println("*");
        }
    }
}
