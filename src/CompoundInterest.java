import java.util.Scanner;

 class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to compound interest calculator\n ");
        System.out.println("please enter your principle amount RS: ");
        int principle = input.nextInt();

        System.out.println("now tell me your rate of interest :");
        float rate = input.nextFloat();

        System.out.println("now tell me how many years are you borrow ");
        float years = input.nextFloat();

        double compInt = principle * Math.pow((1 + rate / 100),years);
        System.out.println("your compound interest is RS:" + compInt);
    }
}
