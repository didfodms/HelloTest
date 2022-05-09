
public class Test {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		
		c1.setName("래은");
		c1.setAddress("베라체");
		c1.setPhoneNumber("010-9545-5786");
		c1.setIdNumber(1);
		c1.setMileage(500);
		
		Customer c2 = new Customer(2, 300);
		c2.setName("푸실");
		c2.setAddress("푸실이집");
		c2.setPhoneNumber("010-1111-1111");
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());

	}

}
