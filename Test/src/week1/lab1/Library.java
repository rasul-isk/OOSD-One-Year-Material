package week1.lab1;

import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		
		for(int i=0;i<2;i++) {
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter Book Title: ");
			String title = in.nextLine();
			
			System.out.println("Enter Book Author: ");
			String author = in.nextLine();
			
			System.out.println("Enter No. Of Pages: ");
			int noOfPages = in.nextInt();
			
			Book b = new Book(title,author,noOfPages);
			
			books[i]=b;
			
		}
		
		for(Book b: books) {
			if(b != null) System.out.println(b.toString());
		}
		
		books[1].Borrow();
		
		for(Book b: books) {
			if(b != null) System.out.println(b.toString());
		}
		
		books[1].BookReturn();
		
		for(Book b:books) {
			if (b!=null) System.out.println(b.toString());
		}

	}//end main

}//end class
