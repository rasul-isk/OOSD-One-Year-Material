package week6.lab2;

public class CarTest{
	
	public static void main(String args[]){
		
		Car car1 = new Car();
		
		car1.setWheels(4);
		car1.setPass(6);
		car1.setType("saloon");

		System.out.println("Car1: " + car1);

		
		Car car2 = new Car();
		
		car2.setWheels(4);
		car2.setPass(7);
		car2.setType("People Carrier");
		
		System.out.println("Car2: " + car2);
		
		Hgv h = new  Hgv(3200, 18, 2);
		
		System.out.println(h);
		
		
		
	}
}
