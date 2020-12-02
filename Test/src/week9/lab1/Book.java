package week9.lab1;

public class Book extends LibraryItem {
	
	private String author;
	private String title;
	private int numPages;
	
	
	public Book(String author, String title, int numpages) {
		setAuthor(author);
		setTitle(title);
		setNumPages(numPages);
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getNumPages() {
		return numPages;
	}


	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}


	@Override
	public double calculatePrice() {
		return 1.50;
	}


	@Override
	public String toString() {
		return "Book [author=" + author + ", title=" + title + ", numPages=" + numPages + "]";
	}

	
	
	
	
}
