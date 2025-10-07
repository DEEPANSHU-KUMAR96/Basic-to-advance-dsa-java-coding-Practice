package com.Patterns;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your Number row: ");
        int row = sc.nextInt();
        System.out.print("Please enter a number of col: ");
        int col = sc.nextInt();
         for (int i = 1; i<=row; i++){
             for (int j = 1; j<=col; j++){
                 System.out.print("* ");
             }
             System.out.println();
         }
    }
}
