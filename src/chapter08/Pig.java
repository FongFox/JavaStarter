package chapter08;

public class Pig implements IAnimal {
	@Override
	public void animalSound() {
		// The body of animalSound( ) is provided here
		System.out.println("The pig says: wee wee");
	}

	@Override
	public void run() {
		// The body of sleep( ) is provided here
		System.out.println("Zzz");
	}
}
