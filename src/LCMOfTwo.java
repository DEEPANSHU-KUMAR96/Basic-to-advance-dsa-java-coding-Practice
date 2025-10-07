import java.util.Scanner;

 class LCMOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find here the least common LCM");
        System.out.print("please enter your number:");
        int first = input.nextInt();
        System.out.print("please enter your number:");
        int second = input.nextInt();
        int lcm = lcm(first,second);
        System.out.println("Your lcm is:" + lcm);
    }
    public  static int lcm(int first, int second){
        int i = 1;
        while (true){
            int factor =  first * i;
            if (factor % second == 0){
                return  factor;
            }
            i++;
        }

    }
}
