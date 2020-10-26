package week3.lab1;

public class Employee {
	//Variables 
	private String fname;
	private String lname;
	private static int count; //no. of objects instantiatied
	private static int staffNumber = 1;
	private int employeeNumber;
	

	//Constructors
	public Employee() {
		setFname("");
		setLname("");

	}

	public Employee(String fname, String lname) {
		setFname(fname);
		setLname(lname);
		setEmployeeNumber(staffNumber);
		staffNumber++;
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
	
	
	public static int getStaffNumber() {
		return staffNumber;
	}

	public static void setStaffNumber(int staffNumber) {
		Employee.staffNumber = staffNumber;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
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
