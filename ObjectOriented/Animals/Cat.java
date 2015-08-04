
public class Cat extends Animal {
	
	
	private String name = "";
	private static final String SOUND = "Meow";
	
	
	public Cat(String name){
		super(name, Cat.SOUND);
	}
	
	
	@Override
	public void move(){
		System.out.println("The Cat is moving..");
	}
	@Override
	void sleep(){
		System.out.println("The Cat is sleeping..");
	}
	

	
}// End of Cat
