package homework9;

public class Invoice implements Payable {

	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public String getPartNumber() {
		return partNumber;
	}
	
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	public String getPartDescription() {
		return partDescription;
	}
	
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getPricePerItem() {
		return pricePerItem;
	}
	
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	
	public Invoice() {
	}
	
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}

	@Override
	public double getPaymentAmount() {
		return pricePerItem*quantity;
	}
	
	public String toString() {
		String res = "";
		res += "invoice:\n";
		res += "part number: "+partNumber+" ("+partDescription+")\n";
		res += "iquantity: "+quantity+"\n";
		res += "price per item: $"+pricePerItem+"\n";
		res += "payment due: $"+getPaymentAmount()+"\n";
		return res;
	}
	
}