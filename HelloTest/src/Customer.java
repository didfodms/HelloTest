
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
		String str = "<�� ����>";
		str += "\n�̸� : " + super.getName();
		str += "\n�ּ� : " + super.getAddress();
		str += "\n��ȭ��ȣ : " + super.getPhoneNumber();
		str += "\n����ȣ : " + this.idNumber;
		str += "\n���ϸ��� : " + this.mileage + "\n";
		
		return str;
	}
	
}
