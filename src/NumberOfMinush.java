import java.util.Scanner;

class NumberOfMinush {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome code: ");
        System.out.print("Enter a first Number: ");
        int firstNum =input.nextInt();
        System.out.print("please enter a second num: ");
        int secondNum = input.nextInt();
        int min = firstNum - secondNum;
        System.out.print("min of your number is:" +min);


    }
}
