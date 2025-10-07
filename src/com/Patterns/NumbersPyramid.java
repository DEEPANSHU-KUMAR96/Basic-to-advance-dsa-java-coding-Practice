package com.Patterns;

import java.util.Scanner;

public class NumbersPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number of rows: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++){
            //for space
            for (int j = 1; j <= row-i; j++){
                System.out.print(" ");
            }
            // print numbers and row times
            for (int k = 1; k<=i; k++){
                System.out.printf("%3d", i); // each number takes up 3 spaces
            }
            System.out.println();
        }
    }


}
