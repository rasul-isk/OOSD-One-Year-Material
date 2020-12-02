package week9.lab1;

public class Student extends Person{
	
	String course;
	
	public Student(String name, String course) {
		super(name);
		setCourse(course);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "A student studying " + course;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
}
