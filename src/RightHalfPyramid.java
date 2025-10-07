import java.util.Scanner;

 class RightHalfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to star patten");
        System.out.println("please enter a number of rows:");
        int rows = input.nextInt();
        printRightHalfPyramid(rows);

    }
    public static void printRightHalfPyramid(int maxRows){
        int rows = maxRows;
        while (rows > 0){
            int i = 0;
            while (i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
}
