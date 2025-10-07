package com.Patterns;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number of rows: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++){
            for (int j =1; j <= row-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // second lower half
        for (int i = row; i >= 1; i--){
            for (int j =1; j <= row-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
