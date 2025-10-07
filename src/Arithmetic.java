import java.util.Scanner;

 class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Arithmetic Calculator\n ");
        System.out.print("Enter a first Number: ");
        int first = input.nextInt();
        System.out.println("Please Enter a second Number: ");
        int second = input.nextInt();
        int add = first + second;
        int sub = first - second;
        int mul = first * second;
        int div = first / second;
        int mod = first % second;

        System.out.println("Addition is: " + add);
        System.out.println("subtraction is: " + sub);
        System.out.println("multiplication is: " + mul);
        System.out.println("Divide is: " + div);
        System.out.println("modulus is: " +mod);
    }
}
