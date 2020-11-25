package week8.lab1;

public class Rectangle extends TwoDShape{
	
	private double length;
	private double breadth;
	
	
	public Rectangle(String name, String colour, double length, double breadth) {
		super(name, colour);
		setLength(length);
		setBreadth(breadth);
	}
	
	
	

	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}





	@Override
	public double area() {
		return length*breadth;
	}
	
	@Override
	public String toString() {
		return (super.toString() + "\nLength = " + length + "\nBreadth" + breadth);
	}
	
	
	
	
	
	
	
	
}
