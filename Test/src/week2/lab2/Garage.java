package week2.lab2;

import java.util.Scanner;

public class Garage {

	public static void main(String[] args) {

		//1. List all Car
		//2. Enter a car for sale
		//3. List all Cars sold
		//4. Exit
		
		int choice = 0;
		int carTotal = 0;
		Car[] cars = new Car[10];
		
		
		
		while(choice !=4) {
			Scanner in = new Scanner(System.in);
			
			System.out.println("Please enter a choice:");
			System.out.println("1.List all Car");
			System.out.println("2.Enter a car for sale");
			System.out.println("3.List all Cars sold");
			System.out.println("4.Exit");
			
			choice = in.nextInt();
			
			if(choice == 1) {
				for(Car c:cars) {
					if(c != null) System.out.println(c.toString());
				}
			}
			else if(choice == 2) {
				if(carTotal < 9) {
				Scanner incar = new Scanner(System.in);
				String make;
				String model;
				double engineSize;
				double price;

				System.out.println("Please enter car make:");
				make = incar.nextLine();
				
				System.out.println("Please enter car model:");
				model = incar.nextLine();
				
				System.out.println("Please enter car engine size:");
				engineSize = incar.nextDouble();
				
				System.out.println("Please enter car price:");
				price = incar.nextDouble();
				
				Car c = new Car(make,model,engineSize,price);
				
				cars[carTotal] = c;
				carTotal ++;
				}
				else {
					System.out.println("You have too many cars!!!");
				}
			}
			else if(choice == 3) {
				System.out.println("Choise3");
			}
			else if(choice == 4) {
				System.out.println("Goodbye!!!");
				System.exit(0);
			}
			
		}//end while
		

	}//end main

}//end class
