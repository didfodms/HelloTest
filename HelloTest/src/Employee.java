
public class Employee {

	String firstName;
	String lastName;
	double monthlySalary;
	
	public Employee(String fN, String lN, double mS) {
		firstName = fN;
		lastName = lN;
		monthlySalary = mS;
	}
	
	String getName() {
		return firstName;
	}

	String getLastName() {
		return lastName;
	}
	
	void setSalary(double sS) {
		if(sS >= 0)
			monthlySalary = sS;
	}
	
	double getSalary() {
		return monthlySalary;
	}
	
}
