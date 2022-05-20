package homework9;

public class HourlyEmployee extends Employee {

	private double wage;
	private double hours;
	
	public double getWage() {
		return wage;
	}
	
	public void setWage(double wage) {
		this.wage = wage;
	}
	
	public double getHours() {
		return hours;
	}
	
	public void setHours(double hours) {
		this.hours = hours;
	}
	
	public HourlyEmployee() {
	}
	
	public HourlyEmployee(double wage, double hours) {
		super();
		this.wage = wage;
		this.hours = hours;
	}
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		super.setFirstName(firstName);
		super.setLastName(lastName);
		this.wage = wage;
		this.hours = hours;
	}
	
	@Override
	public double getPaymentAmount() {
		return wage*hours;
	}
	
}
