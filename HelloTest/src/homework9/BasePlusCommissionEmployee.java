package homework9;

public class BasePlusCommissionEmployee extends CommissionEmployee{

	private double baseSalary;

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public BasePlusCommissionEmployee() {
		super();
	}
	
	public BasePlusCommissionEmployee(double baseSalary) {
		super();
		this.baseSalary = baseSalary;
	}
	
	/*
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double baseSalary) {
		//조부모 클래스는 어떻게 생성자로 불러오나요?
		//밑의 코드 오류. super.super()도 불가능.. 어케해 
		super(firstName, lastName, socialSecurityNumber);
		super.setFirstName(firstName);
		super.setLastName(lastName);
		this.baseSalary = baseSalary;
	}
	*/
	
	@Override
	public double getPaymentAmount() {
		return baseSalary;
	}
	
}
