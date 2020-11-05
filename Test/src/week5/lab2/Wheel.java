package week5.lab2;

public class Wheel {
	//variables
	private float radius;


	
	
	//Constructors
	public Wheel(float radius) {
		this.radius = radius;
	}


	
	//Getters & Setters
	

	public float getRadius() {
		return radius;
	}




	public void setRadius(float radius) {
		this.radius = radius;
	}




	
	
	
	//toString
	
	@Override
	public String toString() {
		return "Wheel [radius=" + radius + "]";
	}
}
