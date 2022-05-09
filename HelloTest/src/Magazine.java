
public class Magazine extends Publication {

	private String issue;
	
	public Magazine(String title, double price, String issue) {
		super(title, price);
		this.issue = issue;
	}
	
	public void setIssue(String issue) {
		this.issue = issue;
	}
	
	public String getIssue() {
		return this.issue;
	}
	
	public void sell(int qty) {
		System.out.println(getPrice()*qty-500);
	}
	
}
