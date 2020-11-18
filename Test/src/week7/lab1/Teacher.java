package week7.lab1;

import java.util.Arrays;

public class Teacher extends Person{
	
	private int numCourses;
	
	private String[] courses;
	
	private static final int MAXCOURSES=10;
	
	public Teacher(String name, String address) {
		super(name,address);
		numCourses = 0;
		courses = new String[MAXCOURSES];
	}
	
	public boolean addCourse(String course) {
		for(int i = 0; i<numCourses; i++) {
			if(courses[i].equals(course)) {
				return false;
			}
		}
		courses[numCourses] = course;
		numCourses++;
		return true;
	}


	public boolean removeCourse(String course) {
		int courseindex = numCourses;
		
		for(int i = 0; i<numCourses; i++) {
			if(courses[i].equals(course)) {
				courseindex =i;
				break;
			}
		}
		if(courseindex == numCourses) {
			return false;
		}
		else {
			for(int i = courseindex; i < numCourses; i++) {
				courses[i] = courses[i+1];
			}
		numCourses--;
		return true;
		}
	}
	
	

	@Override
	public String toString() {
		return "Teacher [numCourses=" + numCourses + ", courses=" + Arrays.toString(courses) + "]";
	}
	
	
}