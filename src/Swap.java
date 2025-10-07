import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome in swapimg progra\n\n");
        System.out.print("Enter a value of A: ");
        int a =input.nextInt();
        System.out.print("Enter a value of B: ");
        int b =input.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("Swapping is done...");
                System.out.println("Value of A: " + a);
        System.out.println("Value of B: " + b);
    }
}



