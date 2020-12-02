package week9.lab1;

public class Employee extends Person{
	
	int salary;
	
	public Employee(String name, int salary) {
		super(name);
		setSalary(salary);
	}

	@Override
	public String getDescription() {
		return null;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
	
	
	
}
