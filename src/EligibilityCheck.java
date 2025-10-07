import java.util.Scanner;

 class EligibilityCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Driving Licence Portal ");
        System.out.println("Enter your age");
        int age = input.nextInt();
        if(age >= 18){
            System.out.println("You are Eligible to Licence");
        }else {
            System.out.println("You are not eligible to ride");
        }
    }
}
