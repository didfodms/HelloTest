
public class Employee {

	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee(String fN, String lN, double mS) {
		firstName = fN;
		lastName = lN;
		monthlySalary = mS;
	}
	
	public String getName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public void setSalary(double sS) {
		if(sS >= 0)
			monthlySalary = sS;
	}
	
	public double getSalary() {
		return monthlySalary;
	}
	
}
