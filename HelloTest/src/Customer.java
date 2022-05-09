
public class Customer extends Person {

	private int idNumber;
	private int mileage;
	
	public Customer() {
		super();
	}
	
	public Customer(int idNumber, int mileage) {
		super();
		this.idNumber = idNumber;
		this.mileage = mileage;
	}
	
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public int getIdNumber() {
		return this.idNumber;
	}
	
	public int getMileage() {
		return this.mileage;
	}
	
	public String toString() {
		String str = "<고객 정보>";
		str += "\n이름 : " + super.getName();
		str += "\n주소 : " + super.getAddress();
		str += "\n전화번호 : " + super.getPhoneNumber();
		str += "\n고객번호 : " + this.idNumber;
		str += "\n마일리지 : " + this.mileage + "\n";
		
		return str;
	}
	
}
