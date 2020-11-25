package week8.lab1;

public class Cylinder extends ThreeDShape{
	
	private double height;
	private double radius;
	
	public Cylinder(String name, String colour) {
		super(name, colour);
	}
	
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public double area() {
		return 2 * Math.PI * radius * height;
	}
	
	@Override
	public double volume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}

	
	
	
	
	

}
