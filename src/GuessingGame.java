import java.util.Scanner;

class GuessingGame {
    int random;

    GuessingGame(){
        random = (int) Math.ceil(Math.random()*100);
    }
    int guss(int guessNumber){
        return guessNumber-random;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        System.out.println("welcome to the guessing number game please enter a number 1 to 100\n");

        int guess;
        int result;
        do {
            System.out.print("Guess the number:");
            guess = sc.nextInt();
            result = game.guss(guess);
            if (result == 0){
                System.out.println("congrats, your guess is correct");
            }else if(result<0) {
                System.out.println("Please guss higher");
            }else {
                System.out.println("please guess lower");
            }
        }while (result !=0);
    }
}
