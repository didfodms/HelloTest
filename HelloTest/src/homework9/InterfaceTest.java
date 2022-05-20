package homework9;

public class InterfaceTest {

	public static void main(String[] args) {

		Invoice invoice1 = new Invoice("123", "의자", 2, 300.00);
		Invoice invoice2 = new Invoice("456", "책상", 4, 700.00);
		SalariedEmployee salariedEmployee1 = new SalariedEmployee("양", "래은", "010-9545-5786", 800.00);
		SalariedEmployee salariedEmployee2 = new SalariedEmployee("양", "푸실", "010-0000-0000", 1200.00);
		
		Payable[] payable = new Payable[4];
		
		payable[0] = invoice1;
		payable[1] = invoice2;
		payable[2] = salariedEmployee1;
		payable[3] = salariedEmployee2;
		
		for(int i=0; i<payable.length; i++) {
			System.out.println(payable[i].toString());
		}

	}

}
