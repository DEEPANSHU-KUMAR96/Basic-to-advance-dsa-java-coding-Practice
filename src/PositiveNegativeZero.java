import java.util.Scanner;

 class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker\n");
        System.out.println("Please Enter Your Number");
        int num = input.nextInt();
        if (num > 0){
            System.out.println("Number is Positive");
        } else if (num == 0) {
            System.out.println("Number is Zero");

        }else {
            System.out.println("Number is Negative");
        }
    }
}
