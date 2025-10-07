import java.util.Scanner;

 class GradesBasedMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Grades calculator");
        System.out.println("Please enter your percentage: ");
        float percentage = input.nextFloat();

       if(percentage >=90){
           System.out.println("you have got A");
       } else if (percentage >=75) {
           System.out.println("you have got B");
       } else if (percentage >= 60) {
           System.out.println("you have got c");
       } else if (percentage >= 30) {
           System.out.println("you have got D");

       }else{
           System.out.println("you have failed");
       }
    }
}
