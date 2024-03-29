package week7.lab2;

public class Cow extends Animal{

	public Cow(String type, int age, char gender) {
		super(type, age, gender);
	}

	@Override
	public void eat() {
		System.out.println("Cow is eating");
	}

	@Override
	public void sleep() {
		System.out.println("Cow is sleeping");
	}

	@Override
	public void makeSound() {
		System.out.println("Muuuu");
	}

	@Override
	public String toString() {
		return "Cow: " + super.toString();
	}
	
	
	
}
