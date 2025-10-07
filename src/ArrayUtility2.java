import java.util.Scanner;

public class ArrayUtility2 {
    public static int[][] input2DArray () {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number of Rows:");
        int rows = input.nextInt();
        System.out.print("Please Enter the Numbers of Column:");
        int column = input.nextInt();
        int[][] numArray = new int[rows][column];

        int i = 0;
        while (i < rows){
            int j = 0;
            while (j < column){
                System.out.print("Please Enter Element row:" +(i+1) + ", column: " + (j+1) + " :");
                numArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }
    public static void displayArray(int[]numArray){
        int i = 0;
        while (i < numArray.length){
            System.out.print(numArray[i]+ " ");
            i++;
        }
        System.out.println();
    }
}
