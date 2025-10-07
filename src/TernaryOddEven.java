import java.util.Scanner;

 class TernaryOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to odd even number finder");
        System.out.print("Please enter your number:");
        int num = sc.nextInt();
        String result = num%2==0 ? "Even":"odd";
        System.out.println("your number is:" + result);
    }
}
