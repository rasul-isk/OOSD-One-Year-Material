package week7.lab2;

public class Cylinder extends Circle{
	  private double height;

	  public Cylinder(double r, double h){ 
	    setHeight(h);
	  }

	  public void setHeight(double h){ 
		  height = h; 
		  }

	  public double getHeight(){ 
		  return height;
		  }

	  public double area(){ 
		  return 2 * super.area() + 
	       2 * Math.PI * getRadius() * height; 
		  }

	   public String toString() {		
		return (super.toString() + " Height : " + height);
	   }
	}
