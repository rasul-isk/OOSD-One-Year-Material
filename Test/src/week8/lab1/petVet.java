package week8.lab1;


public class petVet {
	public static void Main(String[] args) {
		Animal dog = new Dog("Poodle", 4, 'M');
		
		Animal cat = new Cat("Tom", 2, 'F');
		
		Animal c = new Cow("Heffer", 3, 'M');
		
		Animal[] animals = new Animal[3];
		
		animals[0] = dog;
		animals[1] = cat;
		animals[2] = c;
		
		for(Animal ani:animals) {
			System.out.println(ani);
			ani.eat();
			ani.sleep();
			ani.makeSound();
		}
		
		Vet v = new Vet("John");
		
		v.vaccincate(dog);
		v.vaccincate(cat);
		
		v.vaccinnateMe(animals);
	}
}
