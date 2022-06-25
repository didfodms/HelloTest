package finalExam;

public abstract class Employee extends Date {

	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private final int birthMonth;
	private final int birthDay;
	private final int birthYear;
	
	public Employee(String firstName, String lastName, String socialSecurityNumber, int birthMonth, int birthDay, int birthYear) {
		super(birthMonth, birthDay, birthYear);
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.birthYear = birthYear;
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public String getBirthDate() {
		return super.toString();
	}
	
	public abstract double earnings();
}
