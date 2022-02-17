import java.util.Random;
import java.util.Scanner;

public class NumberGuessProject {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean correctGuess = false;

        Random random = new Random();
        int computerGuess = random.nextInt(99) + 1;

        int guessCount = 0;

        while(!correctGuess) {
            System.out.println("Enter your guess: ");
            int userGuess = sc.nextInt();
            guessCount ++;

            if(userGuess >= 1 && userGuess <=100) {
                if(userGuess == computerGuess) {
                    System.out.printf("Congrats! You guessed in %d guesses.", guessCount);
                    correctGuess = true;
                }

                else if(userGuess > computerGuess) {
                    System.out.println("Guess too high!");
                }

                else {
                    System.out.println("Guess too low!");
                }
            }

            else {
                System.out.println("That was a wasted guess! Pick between 1 and 100.");
            }
        }
    }
}
