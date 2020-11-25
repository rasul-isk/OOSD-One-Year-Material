package week8.lab1;

public class Sphere extends ThreeDShape{
	private double radius;
	

	public Sphere(String name, String colour) {
		super(name, colour);
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public String toString() {
		return (super.toString());
	}
	
	
	
	
	
	
}
