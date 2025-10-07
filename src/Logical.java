import java.util.Scanner;

 class Logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Eligibility check for ticket");
        System.out.print("Please Enter your Age: ");
        int age = input.nextInt();
        System.out.println("Are you Female? (True/False)");
        boolean isFemale = input.nextBoolean();

        if(age <=5){
            System.out.println("You got 75% discount");
        } else if (isFemale) {
            System.out.println("You got 50% discount");
            
        } else if (age >= 60 && !isFemale) {
            System.out.println("you got 25% discount");
            
        }else {
            System.out.println("You got no discount");
        }

    }
}
