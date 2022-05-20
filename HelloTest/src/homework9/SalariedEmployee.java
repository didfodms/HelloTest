package homework9;

public class SalariedEmployee extends Employee {

	private double weeklySalary;

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	public SalariedEmployee() {
	}
	
	public SalariedEmployee(double weeklySalary) {
		super();
		this.weeklySalary = weeklySalary;
	}
	
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		super.setFirstName(firstName);
		super.setLastName(lastName);
		super.setSocialSecurityNumber(socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	public double getPaymentAmount() {
		return weeklySalary;
	}
	
	public String toString() {
		String res = "";
		res += "salaried employee: "+super.getLastName()+" "+super.getFirstName()+"\n";
		res += "social security number: "+super.getSocialSecurityNumber()+"\n";
		res += "weekly salary: $"+weeklySalary+"\n";
		res += "payment due: $"+getPaymentAmount()+"\n";
		return res;
	}
	
}
