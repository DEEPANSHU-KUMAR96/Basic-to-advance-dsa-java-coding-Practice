import java.util.Scanner;

 class LeftStarPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to star patten");
        System.out.print("please enter a number of rows:");
        int rows = input.nextInt();
        printFirstPattern(rows);
    }
    public static void printFirstPattern(int maxRows){
        int rows = 0;
        while (rows < maxRows){
            System.out.print("*");

            int i = 0;
            while (i <rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}
