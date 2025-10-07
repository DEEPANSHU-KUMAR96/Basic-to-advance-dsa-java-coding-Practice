package com.Patterns;

import java.util.Scanner;

public class SolidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number of rows:");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++){
            // for spaces
            for (int j = 1; j <= row-i; j++){
                System.out.print(" ");
            }
            // for printing stars
            for (int k =1; k<=5; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
