package com.Patterns;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= row; i++){
            for (int j =1; j <= i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
