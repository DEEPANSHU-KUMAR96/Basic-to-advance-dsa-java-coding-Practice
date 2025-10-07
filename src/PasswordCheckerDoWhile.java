import java.util.Scanner;

 class PasswordCheckerDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to password checker");
       String password;
       do {
           System.out.print("Please enter your password:");
            password = sc.next();
       }while (!isValidPassword(password));
        System.out.println("Thanks for entering a valid password");



    }
    public static boolean isValidPassword(String password){
        return password.length() >= 6;
    }
}
