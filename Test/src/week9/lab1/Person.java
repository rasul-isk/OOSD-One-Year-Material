package week9.lab1;

public abstract class Person {
	
	String name;
	String description;
	
	public Person(String name) {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract String getDescription();

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
