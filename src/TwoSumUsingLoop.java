import java.util.Scanner;
class TwoSumUsingLoop {
    public static void main(String[] args) {
    greet();
    int first = readNumber();
    int second =readNumber();
    int sum = first+second;
        System.out.println("sum of two number is: "+ sum);
    }

    public static int readNumber(){
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter your first Number: ");
        int number = input.nextInt();
        return number;
    }
    public static void greet(){
        System.out.println("Welcome to calculator");
    }
}
