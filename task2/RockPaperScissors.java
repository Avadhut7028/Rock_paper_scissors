import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] choices = { "rock", "paper", "scissors" };
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Let's play Rock, Paper, Scissors!");

        while (true) {
            // Get user's choice
            System.out.print("Enter your choice (rock, paper, or scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();

            // Generate computer's choice
            int computerChoiceIndex = random.nextInt(choices.length);
            String computerChoice = choices[computerChoiceIndex];

            System.out.println("Computer's choice: " + computerChoice);

            // Determine the winner
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (userChoice.equals("rock")) {
                if (computerChoice.equals("paper")) {
                    System.out.println("Computer wins!");
                } else {
                    System.out.println("You win!");
                }
            } else if (userChoice.equals("paper")) {
                if (computerChoice.equals("scissors")) {
                    System.out.println("Computer wins!");
                } else {
                    System.out.println("You win!");
                }
            } else if (userChoice.equals("scissors")) {
                if (computerChoice.equals("rock")) {
                    System.out.println("Computer wins!");
                } else {
                    System.out.println("You win!");
                }
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

            // Ask if the user wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }

            System.out.println();
        }

        System.out.println("Thank you for playing!");
    }
}
