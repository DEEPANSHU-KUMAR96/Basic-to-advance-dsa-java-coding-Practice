import java.util.Scanner;

 class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculate Simple interest\n ");
        System.out.println("Please enter your principle amount Rs: ");
        float principle = input.nextFloat();

        System.out.println("Now tell me your rate of interest: ");
        float rate = input.nextFloat();

        System.out.println("Now tell me for how manny years are you borrow: ");
        float years = input.nextFloat();

        float interest = (principle * rate * years) / 100;
        System.out.println("\n \n Your simple interest is Rs:" +interest);
    }
}
