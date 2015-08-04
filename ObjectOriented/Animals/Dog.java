
public class Dog extends Animal {
	

	private String name = "";
	private static final String SOUND = "Bark";


	public Dog(String name){
		super(name, Dog.SOUND);
	}

	
	@Override
	public void move(){
		System.out.println("The Dog is moving..");
	}

	@Override
	void sleep(){
		System.out.println("The Dog is asleep..");
	}



}// End of Dog
