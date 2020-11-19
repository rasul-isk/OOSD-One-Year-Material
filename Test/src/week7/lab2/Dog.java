package week7.lab2;

public class Dog extends Animal{

	public Dog(String type, int age, char gender) {
		super(type, age, gender);
	}

	@Override
	public void eat() {
		System.out.println("Animal is eating");
	}

	@Override
	public void sleep() {
		System.out.println("Animal is sleeping");
	}

	@Override
	public void makeSound() {
		System.out.println("Woof Woof");
	}

	@Override
	public String toString() {
		return "Dog: " + super.toString();
	} 
	
	
	
	
}
