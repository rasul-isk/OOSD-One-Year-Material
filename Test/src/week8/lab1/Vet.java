package week8.lab1;

public class Vet {
	
	private String name;
		
		
		
	public Vet(String name) {
		this.name = name;
	}
		
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void vaccincate(Animal a) {
		System.out.println(this.name + " is vaccintating.");
		
		if(a instanceof Dog) {
			System.out.println("The dog");
			System.out.println("The dog has been vaccintated " + a.toString());
		}
		else if(a instanceof Cat) {
			System.out.println("The cat");
			System.out.println("The cat has been vaccintated " + a.toString());
		}
		else if(a instanceof Cow) {
			System.out.println("The cow");
			System.out.println("The cow has been vaccintated " + a.toString());
		}
				
	}
	
	public void vaccinnateMe(Animal[] animal) {
		for(Animal a: animal ) {
			System.out.println(this.name + " is vaccinatng the ");
			System.out.println(a.getClass().getName());
			System.out.println("The " + a.getClass().getName() + "has been vaccinated " + a.toString());
		}
	}
	
	
	
}
