package com.Patterns;

import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter a numbers of rows: ");
        int row = sc.nextInt();

        for (int i = 1; i<=row; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
