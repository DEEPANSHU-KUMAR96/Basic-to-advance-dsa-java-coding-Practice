import java.util.Scanner;

 class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing bitwise And operator\n");
        System.out.print("enter first number: ");
        int first = input.nextInt();

        System.out.print("enter second number: ");
        int second = input.nextInt();

        int result = first & second;
        System.out.println("Result is:" +result);
    }
}
