package com.Patterns;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number of rows: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //for spaces
            int spaces = 2 * (row-i);
            for (int k = 1; k<=spaces; k++){
                System.out.print(" ");
            }
            //2nd half
            for (int l=1; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i = row; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //for spaces
            int spaces = 2 * (row-i);
            for (int k = 1; k<=spaces; k++){
                System.out.print(" ");
            }
            //2nd half
            for (int l=1; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
