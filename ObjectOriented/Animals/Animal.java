
public abstract class Animal {

	
	private String name = "";
	private String sound = ""; 
	
	
	// This no-args constructor calls the constructor below
	public Animal(){
		this("name", "sound");
	}
	
	// This constructor will return the names and sounds of each Animal Object
	public Animal(String name, String sound){
		this.name = name;
		this.sound = sound;
	}
	
	
	// Methods common to all Animal Objects through Inheritance
	public void makeNoise(){
		System.out.println("The animals name is " + this.name);
		System.out.println("The sound is " + this.sound);
	}
	
	public void move(){
		System.out.println("The animal is moving.....");
	}
	
	public String toString(){
		return this.name;
	}
	
	
	// Abstract methods that MUST be implemented for each Concrete Subclass of Animal
	abstract void sleep();
	
	

}// End of Animal
