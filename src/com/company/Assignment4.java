package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment4 {

    public static void main(String[] args) throws IOException {
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        String text= in.readLine();
        int n= Integer.parseInt(text);
        for(int m=n;m>0;m--){
            for(int j=m;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
