package week7.lab2;

public class AnimalTest
{
	public static void main (String args[])
	{
		Animal dog = new Dog("Poodle", 4, 'M');

		Animal cat = new Cat("Tom", 2, 'F');
		
		Cow c = new Cow("Heffer", 3, 'F');

		Animal[] animals = new Animal[3];
		
		animals[0] = dog;
		animals[1] = cat;
		animals[2] = c;
		
		for(Animal ani: animals) {
			System.out.println(ani);
			ani.eat();
			ani.sleep();
			ani.makeSound();
		}
	}
}
