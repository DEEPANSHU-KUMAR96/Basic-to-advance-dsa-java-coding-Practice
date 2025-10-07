package com.Patterns;

import java.util.Scanner;

public class PalindromicPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number of rows: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++){
            //For space
            for (int j = 1; j <= row-i; j++){
                System.out.print(" ");
            }
            //First half
            for (int k = i; k >= 1; k--){
                System.out.print(k);

            }
            //second half
            for (int l = 2; l <= i; l++){
                System.out.print( l);
            }
            System.out.println();
        }
    }
}
