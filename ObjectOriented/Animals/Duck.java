
public class Duck extends Animal{

	private String name = "";
	private static final String SOUND = "Quack";


	public Duck(String name){
		super(name, Duck.SOUND);
	}


	/**
	 *  This has overridden the move and sleep methods within the Animal SuperClass 
	 *  and implemented its own specification
	 */

	@Override
	public void move(){
		System.out.println("The Duck is moving....");
	}

	@Override
	void sleep(){
		System.out.println("The Duck is sleeping..");
	}


}// End of Duck
