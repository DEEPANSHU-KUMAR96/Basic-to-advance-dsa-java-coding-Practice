package com.exceptionhandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the file name:");
        String fileName = input.next();

        try (FileReader reader = new FileReader(fileName)){
            int read;
            while ((read = reader.read()) != -1){
                System.out.print((char)read);
            }

        }catch (IOException exception){
            System.out.printf("Exception occurred: %s", exception.getMessage());
        }
    }
}
