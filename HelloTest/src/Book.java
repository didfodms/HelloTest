
public class Book extends Publication {

	private String author;
	
	public Book() {
	}
	
	public Book(String title, double price, String author) {
		super(title, price);
		this.author = author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public void sell(int qty) {
		System.out.println(super.getPrice()*qty-1000);
	}
	
}
