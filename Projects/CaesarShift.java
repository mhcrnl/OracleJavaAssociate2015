import java.util.Scanner;


public class CaesarShift {


	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);


		// Declare variables for userInput and the offset for changing the magnitude of encryption and decryption 
		String userInput = "";
		int menuChoice = 0;
		int offset = 0;


		// Provide a User menu to enter a String for encryption and the choice to decrypt an already encrypted message 
		cipherCentre:
			for(;;){
				System.out.println("1) Press 1 for Encryption");
				System.out.println("2) Press 2 for Decryption");
				System.out.println("3) Press 3 to Quit");

				while( ! scan.hasNextInt() ){
					scan.next();
					System.out.println("Please enter a number");

				}
				menuChoice = scan.nextInt();


				if(menuChoice == 1){ 
					System.out.println("Please enter a String for encryption");
					Scanner scan2 = new Scanner(System.in);
					userInput = scan2.nextLine();

					// Validate the userInput to contain only characters for each index of its userInput
					for(int i = 0; i < userInput.length(); i++){
						if( ! Character.isLetter(userInput.charAt(i))){
							System.out.println("\nThis must be a String of letters\n");
							continue cipherCentre;
						}else{
							break;
						}
					}
					System.out.println("Your String is " + userInput + "\n");
					System.out.println("Please enter your key for offsetting the encryption");
					while( ! scan2.hasNextInt() ){
						scan.next();
						System.out.println("\nPlease enter a number");

					}
					offset = scan2.nextInt();
					System.out.println("Your encryption is " + CaesarShift.setEncrypt(userInput, offset) + "\n");
					continue;

				}else if(menuChoice == 2){
					System.out.println("Please enter a String for decryption");
					Scanner scan3 = new Scanner(System.in);
					userInput = scan3.nextLine();

					for(int i = 0; i < userInput.length(); i++){
						if( ! Character.isLetter(userInput.charAt(i))){
							System.out.println("\nThis must be a String of letters\n");
							continue cipherCentre;
						}else{
							break;
						}
					}
					System.out.println("Your String is " + userInput + "\n");
					System.out.println("Please enter your key for offsetting the decryption");
					while( ! scan3.hasNextInt() ){
						scan3.next();
						System.out.println("Please enter a number");

					}
					offset = scan3.nextInt();
					System.out.println("Your decryption is " + CaesarShift.setDecrypt(userInput, offset) + "\n");
					continue;

				}else if(menuChoice == 3){
					System.out.println("\nGoodbye!");
					break;
				}else{

				}


			}// End of cipherCentre

		scan.close();

	}// End of Main


	// This method will encrypt the userInput based on the offset or magnitude of encryption, which are the two arguments
	private static String setEncrypt(String userInput, int offset){

		offset = offset % 26 + 26; // For both the lower and UPPER case alphabets

		StringBuilder encrypt = new StringBuilder();
		for(char i : userInput.toCharArray()){
			if(Character.isLetter(i)){
				if(Character.isUpperCase(i)){
					encrypt.append((char) ('A' + (i - 'A' + offset) % 26));	
				}else{
					encrypt.append((char) ('a' + (i - 'a' + offset) % 26));	
				}

			}else{
				encrypt.append(i);
			}
		}// End of for loop 

		return encrypt.toString();

	}// End of setEncrypt



	// The decryption as you will notice is exactly the same method as above, except the offset is in reverse or negative
	private static String setDecrypt(String userInput, int offset){

		return setEncrypt(userInput, -offset);

	}// End of setDecrypt



}// End of CaesarShift
