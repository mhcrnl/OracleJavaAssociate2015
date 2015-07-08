
import java.util.Random;
import java.util.Scanner;

public class GameApp {

	public static void main(String[] args) {

		// Import the scanner and create object references to get user input and generate random numbers
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		// Create variables for the number of lives and the random number 
		int numberOfLives = 3;
		String livesLeft = "lives left";
		int userGuess = 0;
		int randNumber = 0;
		int [] numberRange = new int [50];
		String userContinueChoice = null;


		gameLoop:// The loop that continues as long as the while loop is true
			while(numberOfLives <= 3 && numberOfLives > 0){
				for(;;){
					randNumber = rand.nextInt(49) + 1; // Creates a random number between 1 and 50
					System.out.println("You have " + numberOfLives + " " + livesLeft);  // Print the number of Lives Left
					System.out.println("Guess a number between 1 and 50");
					while(! scan.hasNextInt()){
						scan.next();
						System.out.println("Please enter a number");  // Handle inputs to be only numbers
					}

					userGuess = scan.nextInt();
					if(userGuess < 1 || userGuess > 50){
						System.out.println("The number is between 1 and 50,");
						break;
					}


					if(randNumber == userGuess){
						System.out.println("Congratulations you earned another life");
						numberOfLives++;
					}
					else if(userGuess != randNumber){
						System.out.println("Try again");
						--numberOfLives;
					}
						
					if(numberOfLives == 0){
							System.out.println("Would you like to play again? Y/N");
							userContinueChoice = scan.next();
							userContinueChoice = userContinueChoice.toUpperCase();
							if(userContinueChoice.equals("Y")){
								numberOfLives = 3;
							}else if(userContinueChoice.equals("N")){
								System.out.println("Goodbye. Thanks for Playin!");
								break gameLoop;
							}
						}
					


				} // End of the Infinite for Loop


			}// End of While

	}// End of Main 


}// End of GameApp

