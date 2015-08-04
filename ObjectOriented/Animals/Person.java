
public class Person extends Animal{

	private String name = "";
	private static final String SOUND = "Yeah";


	/** This constructor passes its' values to the parent constructor in the Animal class
	 * so that Object references to Person will return the appropriate name and sound
	 */

	public Person(String name){
		super(name, Person.SOUND);
	}

	@Override
	//This method has overridden the Animal sleep method to make it more specific to this class
	public void move(){
		System.out.println("The Person is moving....");
	}

	@Override
	void sleep() {
		System.out.println("The Person is sleeping..");	
	}



	/** The methods below are commented out simply because they are unnecessary as these
	 * methods are inherited through the Animal SuperClass, which has these methods
	 * common to all Animal Objects
	 */

	//		public void makeNoise(){
	//			System.out.println("The Person is making noise");
	//		}

	//		public String toString(){
	//			return this.name;
	//		}


}// End of Person
