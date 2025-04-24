import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] choices = {"rock", "paper", "scissors"};
        int playerScore = 0;
        int computerScore = 0;
        
        while (true) {
          
            System.out.print("\nEnter your choice (rock/paper/scissors) or 'quit' to exit: ");
            String userChoice = scanner.nextLine().toLowerCase();
            
            if (userChoice.equals("quit")) {
                break;
            }
          
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice! Please try again.");
                continue;
            }
            
       
            String computerChoice = choices[random.nextInt(3)];
            
        
            System.out.println("Your choice: " + userChoice);
            System.out.println("Computer's choice: " + computerChoice);
            
           
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                     (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                     (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
                playerScore++;
            } else {
                System.out.println("Computer wins!");
                computerScore++;
            }
            
            System.out.println("\nCurrent Score:");
            System.out.println("You: " + playerScore);
            System.out.println("Computer: " + computerScore);
        }
        
     
        System.out.println("\nFinal Score:");
        System.out.println("You: " + playerScore);
        System.out.println("Computer: " + computerScore);
        if (playerScore > computerScore) {
            System.out.println("Congratulations! You won the game!");
        } else if (computerScore > playerScore) {
            System.out.println("Better luck next time! Computer won the game!");
        } else {
            System.out.println("It's a tie game!");
        }
        
        scanner.close();
        System.out.println("\nThanks for playing!");
    }
}