package com.Patterns;

import java.util.Scanner;

public class InvertedHalf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter a number of rows: ");
        int row = sc.nextInt();

        for (int i = 1; i<=row; i++){
            //inner loop for space printing
            for (int j = 1; j<=row-i; j++){
                System.out.print(" ");
            }
            // inner loop for star printing
            for (int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
