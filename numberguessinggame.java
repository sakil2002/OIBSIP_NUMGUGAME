import java.util.Random;
import java.util.Scanner;

public class numberguessinggame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange_innumber = 1;
        int maxRange = 100;
        int targetNumber = random.nextInt(maxRange - minRange_innumber + 1) + minRange_innumber;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've picked a number between " + minRange_innumber + " and " + maxRange + ".");

        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++; 

            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                break;
            } else if (userGuess < targetNumber) {
                System.out.println("Try again! The number is higher.");
            } else {
                System.out.println("Try again! The number is lower.");
            }
        }

        scanner.close();
    }
}
