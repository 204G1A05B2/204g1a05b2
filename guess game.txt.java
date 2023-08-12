import java.util.*;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minRange = 1;
        int maxRange = 100;
        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        
        int attempts = 0;
        int guess = -1;
        
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange + ". Can you guess it?");
        
        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < targetNumber) {
                System.out.println("Try a higher number.");
            } else if (guess > targetNumber) {
                System.out.println("Try a lower number.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number: " + targetNumber);
                System.out.println("It took you " + attempts + " attempts.");
            }
        }
        
        scanner.close();
    }
}
