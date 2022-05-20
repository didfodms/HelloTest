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
		//���θ� Ŭ������ ��� �����ڷ� �ҷ�������?
		//���� �ڵ� ����. super.super()�� �Ұ���.. ������ 
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
