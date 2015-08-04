
public class InheritApp {
	

	public static void main(String[] args) {

		InheritApp ip = new InheritApp();                            
		ip.startProgram();



	}// End of Main
	

	private void startProgram() {


		// Create Object reference variables for each Animal subClass and call methods

		Person person = new Person ("John Doe");
		System.out.println(person);
		person.makeNoise();
		person.move();
		System.out.println("---");

		Cat cat = new Cat ("Felix");
		System.out.println(cat);
		cat.makeNoise();
		cat.move();
		System.out.println("---");

		Dog dog = new Dog ("Marshal");
		System.out.println(dog);
		dog.makeNoise();
		dog.move();
		System.out.println("---");

		Duck duck = new Duck ("Quacky");
		System.out.println(duck);
		duck.makeNoise();
		duck.move();
		System.out.println("---");


		// Using the makeSound method for Animal Objects 
		makeSound(person);
		System.out.println("--");

		makeSound(cat);
		System.out.println("--");

		makeSound(dog);
		System.out.println("--");

		makeSound(duck);
		System.out.println("--");


		// Using the moveAnimal method for Animal Objects
		moveAnimal(person);
		System.out.println("-");

		moveAnimal(cat);
		System.out.println("-");

		moveAnimal(dog);
		System.out.println("-");

		moveAnimal(duck);
		System.out.println("-");


		// Call abstract methods for each Animal SubClass
		person.sleep();
		cat.sleep();
		dog.sleep();
		duck.sleep();
		System.out.println("-");

		// Using the method below for a variable of type Animal to run the sleep method
		goToSleep(person);
		goToSleep(cat);
		goToSleep(dog);
		goToSleep(duck);

	}


	/**
	 *  Methods for each of the Class Objects and SuperClass Objects
	 *  which take any Animal Object
	 */

	private void makeSound(Animal a){
		a.makeNoise();
	}

	private void moveAnimal(Animal a){
		a.move();
	}

	private void goToSleep(Animal a){
		a.sleep();
	}


	/**
	 * Notice how the same methods have to be created for each Animal Object
	 * where instead using a parameter for a variable of type Animal as seen above
	 * allows us to define any Object of type Animal rather than declaring the 
	 * same method for each one
	 */

	//	private void makeSound(Person p){
	//		p.makeNoise();
	//	}

	//	private void makeSound(Cat c){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	//		c.makeNoise();
	//	}

	//	private void makeSound(Dog d){
	//		d.makeNoise();
	//	}


}// End of InheritApp
