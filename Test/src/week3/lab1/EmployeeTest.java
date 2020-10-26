package week3.lab1;

public class EmployeeTest {
	
	public static void main(String[] args) {
		System.out.println("Employees before instantiation : " + Employee.getCount());
		
		Employee e1 = new Employee("Susan", "Baker");
		Employee e2 = new Employee("Bob", "Jones");
		System.out.println("Employees after instantiation : " + Employee.getCount());
		System.out.println("Employee 1 : " + e1.getFname() + " " + e1.getLname());
		System.out.println("Employee 2 : " + e2);
		
		
		Employee e3 = new Employee("Tom", "Jones");
		Employee e4 = new Employee("Joe", "Bloggs");
		System.out.println(e3);
		System.out.println(e4);
		System.out.println("No. of Employees: " + Employee.getCount());
		
		e1 = null;
		e2 = null;
		
		System.gc(); // explicit call to garbage collector
		
		while(Employee.getCount() != 0) {
			System.out.println("Waiting on garbage collector to finish");
		}
		System.out.println("Employees after garbage collection : " + Employee.getCount());
		
	}
	
}
