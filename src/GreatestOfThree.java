import java.util.Scanner;

 class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("largest number checker ");
        System.out.print("Please Enter your first Number:");
        int first = input.nextInt();

        System.out.print("Please Enter your second Number:");
        int second = input.nextInt();

        System.out.print("Please Enter your third Number:");
        int third = input.nextInt();

        if(first >= second && first >= third ){
            System.out.println(first+ " is the greatest number");
        } else if (second >= third) {
            System.out.println( second+ " is a greatest number");

        }else {
            System.out.println(third + " is the greatest number");
        }
    }
}
