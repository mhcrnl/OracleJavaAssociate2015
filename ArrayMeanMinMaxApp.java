import java.util.Random;

public class ArrayMeanMinMaxApp {

	public static void main(String[] args) {

		int [] scores = new int [10];

    Random random = new Random();  // Initialise an Object Reference Variable to Create Random Numbers
		for(int i = 0; i < scores.length; ++i){
			scores [i] = random.nextInt(100) + 1;  // Will Print the length of scores or 100 from 0 - 99
			System.out.println("\n" + scores[i]);  // Will print scores variable i 
			//System.out.println((scores[i] / scores.length));

		}

		// The mean calculates the average for the random numbers that are printed out 

		double total = 0;
		for(int i = 0; i < scores.length; ++i){
			total = total + scores[i];

		}

		double mean = total / scores.length;  // This will divide the total of the numbers returned by the length of the scores array
		System.out.println("\nThe mean is " + mean);


		// The min

		int min = scores[0];
		for(int i = 1; i < scores.length; ++i){
			if(scores [i] < min){
				min = scores [i];
			}

		}
		System.out.println("\nThe min is " + min);


		// The max

		int max = scores[0];
		for(int i = 1; i < scores.length; ++i){
			if(scores [i] > max){
				max = scores [i];
			}

		}
		System.out.println("\nThe max is " + max);


	

	}// End of Main
	

}// End of ArrayMeanMinMaxApp











