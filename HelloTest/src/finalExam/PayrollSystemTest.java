package finalExam;

public class PayrollSystemTest {

	public static void main(String[] args) {

		SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 6, 15, 1944 ,800.00);
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 12, 29, 1960, 16.75, 40);
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 9, 8, 1954, 10000, .06);
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 3, 2, 1965, 5000, .04, 300);
		
		System.out.printf("%s: %s%nsocial security number: %s%nbirth date: %s%n);
		Employee[] employees = new Employee[4];
		
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;
		
		for
		
		System.out.printf("Employees processed polymorphically:%n%n");
		
	}

}
