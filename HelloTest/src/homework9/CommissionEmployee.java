package homework9;

public class CommissionEmployee extends Employee {

	private double grossSales;
	private double commissionRate;
	
	public double getGrossSales() {
		return grossSales;
	}
	
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	
	public double getCommissionRate() {
		return commissionRate;
	}
	
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	public CommissionEmployee() {
		super();
	}
	
	public CommissionEmployee(double grossSales, double commissionRate) {
		super();
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		super.setFirstName(firstName);
		super.setLastName(lastName);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	@Override
	public double getPaymentAmount() {
		return grossSales*commissionRate;
	}
	
}
