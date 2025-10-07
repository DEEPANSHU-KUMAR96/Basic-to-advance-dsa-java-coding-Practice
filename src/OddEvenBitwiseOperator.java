import java.util.Scanner;

class OddEvenBitwiseOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Odd and Even Number calculator");
        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        if ((num & 1) ==1){
            System.out.println("your number is odd");
        }else{
            System.out.println("your number is even");
        }
    }
}
