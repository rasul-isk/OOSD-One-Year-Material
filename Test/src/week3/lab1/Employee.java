package week3.lab1;

public class Employee {
	//Variables 
	private String fname;
	private String lname;
	private static int count; //no. of objects instantiatied
	
	//Constructors
	public Employee() {
		setFname("");
		setLname("");
		++count;
	}

	public Employee(String fname, String lname) {
		setFname(fname);
		setLname(lname);
		++count;
	}
	
	
	
	
	//Getters & Setters
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Employee.count = count;
	}


	
	//toString
	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + "]";
	}
	
	//Finalize
	public void finalize() {
		--count;
	}
	
	
	
}
