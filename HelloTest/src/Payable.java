
interface Payable {
	
	public double getPaymentAmount();

}

public class Employee implements Payable {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	public Employee() {
	}
	
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
}

class CommissionEmployee extends Employee {
	
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee() {
		super();
	}
	
	public CommissionEmployee(double grossSales, double commissionRate) {
		super();
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
}

class BasePlusCommissionEmployee extends CommissionEmployee {
	
	private double baseSalary;
	
	public BasePlusCommissionEmployee() {
		super();
	}
	
	public BasePlusCommissionEmployee(double baseSalary) {
		super();
		this.baseSalary = baseSalary;
	}
	
}

class HourlyEmployee extends Employee {
	
	private double wage;
	private double hours;
	
	public HourlyEmployee() {
		super();
	}
	
	public HourlyEmployee(double wage, double hours) {
		super();
		this.wage = wage;
		this.hours = hours;
	}
	
}

class SalariedEmployee extends Employee {
	
	private double weeklySalary;
	
	public SalariedEmployee() {
		super();
	}
	
	public SalariedEmployee(double weeklySalary) {
		super();
		this.weeklySalary = weeklySalary;
	}
	
}

class Invoice implements Payable {
	
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public Invoice() {
		super();
	}
	
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
		super();
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	
}