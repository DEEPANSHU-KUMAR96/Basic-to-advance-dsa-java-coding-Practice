import java.util.Scanner;

 class MinimumTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to minimum number finder");
        System.out.print("Please enter your first number:");
        int num1 = sc.nextInt();
        System.out.print("please enter your second number:");
        int num2 = sc.nextInt();

        MinimumTernary ternary = new MinimumTernary();
        int min = ternary.min(num1,num2);
        System.out.println("minimum number is:" + min);
    }
    public  int min(int num1, int num2){
        return num1 < num2 ? num1:num2;
    }

}
