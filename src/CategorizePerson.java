import java.util.Scanner;

 class CategorizePerson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Categorize persons into different groups");
        System.out.print("Please Enter your Age: ");
        int age = input.nextInt();

        if(age <=13){
            System.out.println("You are a child");
        } else if (age <=20) {
            System.out.println("You are a Teen ");
        } else if (age <=60) {
            System.out.println("you are a Adult");
        }else {
            System.out.println("you are a senior");
        }
    }
}
