import java.util.Scanner;

class TernaryStudentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your marks:");
        int marks = sc.nextInt();
        String category = marks >80? "High" :(marks>50? "moderate":"Low");
        System.out.println("your category is:" + category);
    }
}
