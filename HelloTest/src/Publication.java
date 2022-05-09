
public class Publication {

	private String title;
	private double price;
	
	public Publication() {
	}
	
	public Publication(String title, double price) {
		this.title = title;
		this.price = price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void sell(int qty) {
		System.out.println(getPrice()*qty);
	}
	
}
