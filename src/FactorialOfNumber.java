import java.util.Scanner;

 class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to factorial calculator");
        System.out.print("Please Enter your Number: ");
        int num = input.nextInt();
      long fact =  factorialNum(num);
        System.out.println("factorial is: "+ fact);
    }
    public static long factorialNum(int num){
        if (num <2){
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i <= num){
            fact *= i;
           i++;
        }
        return fact;

    }
}
