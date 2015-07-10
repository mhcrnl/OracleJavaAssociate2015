import java.util.Scanner;

public class CompoundOperatorApp {

	public static void main(String[] args) {

		int userInput = 0;
		int userMenuChoice = 0;


		Scanner scan = new Scanner(System.in);


		menuChoice:
			for(;;){
				// First Present a menu for the user to increment, decrement or quit
				System.out.println("Welcome!");
				System.out.println("Please select 1 to increment your chosen number or 2 to decrement it");
				System.out.println("Press 3 to quit");
				userMenuChoice = scan.nextInt();
			 	
				// Handle the userMenuChoice 
				if(userMenuChoice == 1){
					System.out.println("Please enter a number to increment");
					userInput = scan.nextInt();
					System.out.println("The number you have chosen is " + userInput + " and the increment is "
							+ (userInput += 1)); // Increment the userInput
				}else if(userMenuChoice == 2){
					System.out.println("Please enter a number to decrement");
					userInput = scan.nextInt();
					System.out.println("The number you have chosen is " + userInput + " and the decrement is "
							+ (userInput-=1)); // Decrement the userInput
				}else if(userMenuChoice == 3){
					System.out.println("Goodbye!");
					break;
				}else{
					System.out.println("Invalid Choice! Please Choose 1, 2 or 3");
				}
				
			} // End of menuChoice  
				



	}// End of Main

}// End of CompoundOperatorApp
