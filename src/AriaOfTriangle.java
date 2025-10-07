import java.util.Scanner;

 class AriaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to aria calculator");
        System.out.print("Please enter your base in cm: ");
        double base = input.nextDouble();
        System.out.println("Now enter your perpendicular height in cm: ");

        double height = input.nextDouble();
        double area = 0.5 * base * height;

        System.out.println("the area of your triangle is:" + area + "cm");
    }
}
