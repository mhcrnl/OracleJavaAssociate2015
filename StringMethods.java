
public class StringMethods {

	public static void main(String[] args) {


		// Byte numbers
		byte number1 = 1;
		byte number2 = 2;
		
		// The sumOfBytes has to cast the bytes number1 and number2 to byte as they have been promoted to ints so casting is required
		byte sumOfBytes = (byte) (number1 + number2);
		System.out.println("The sum of bytes is " + sumOfBytes);
		

		int age = 24;
		String name = "John Doe";
		int houseNo = 9;
		
		
		// Print and see how concatenating and addition can be influenced by precedence
		System.out.println((age + houseNo) + " " + name); // 33 John Doe because the addition was in parentheses so it took precedence
		System.out.println(name + " " + age + houseNo); // John Doe 249 because no parenthesis and the operator precedence made the output into a String
		System.out.println(houseNo + name + age);// 9John Doe24 again because it became a String with no parenthesis enforced


		// using the .concat method for Strings 
		String greetings = "Hello Worlds!";
		greetings.concat("How are you?");
		greetings = greetings.concat(" How are you?");
		System.out.println(greetings); 
		
		
		System.out.println(greetings.length()); // 26 including spaces and characters
		System.out.println(greetings.substring(4));
		boolean check = greetings.endsWith("ou?");
		
		
		// Checks if the greetings variable endsWith the "ou?" sequence of chars
		System.out.println(check);
		
		// Checks if the greetings variable startsWith the "He" sequence of chars
		check = greetings.startsWith("He");
		System.out.println(check);

		
		// Using the StringBuilder class and its methods
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");
		System.out.println(sb);
		
		sb.insert(11, ". Are you well?");
		System.out.println(sb);
		
		
		


	}// End of Main



}// End of StringMethods


