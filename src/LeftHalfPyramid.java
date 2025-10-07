import java.util.Scanner;

 class LeftHalfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to star pattern");
        System.out.println("please enter a number of rows:");
        int rows = input.nextInt();
        leftHalfPyramid(rows);

    }
    public static void leftHalfPyramid(int maxRows){
        int rows = maxRows;
        while (rows > 0){
            // this loop prints spaces
            int j = 0;
            while (j < rows - 1){
                System.out.print(" ");
                j++;
            }
            //this loop print spaces

            int i = 0;
            while (i <= (maxRows - rows)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
}
