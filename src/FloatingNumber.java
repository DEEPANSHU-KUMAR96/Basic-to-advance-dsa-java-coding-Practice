import java.util.Scanner;

public class FloatingNumber
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are Float Multiplication\n");
        System.out.println("Enter a first Number: ");
        double first = input.nextDouble();

        System.out.println("Please Enter a second Number: ");
        double second = input.nextDouble();

        double mul  = first*second;

        System.out.println("Multiplication is:" + mul);
    }
}
